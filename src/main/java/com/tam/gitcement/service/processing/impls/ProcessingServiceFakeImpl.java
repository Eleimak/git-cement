package com.tam.gitcement.service.processing.impls;

import com.tam.gitcement.dataset.TestData;
import com.tam.gitcement.model.Cadr;
import com.tam.gitcement.model.Processing;
import com.tam.gitcement.service.cadr.impls.CadrServiceFakeImpl;
import com.tam.gitcement.service.processing.interfaces.IProcessingService;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class ProcessingServiceFakeImpl implements IProcessingService {


    final private CadrServiceFakeImpl cadrService;
    final private TestData data;

    private final Tesseract tesseract;
    private final     String testdata;
    private final     String dir;

    @Autowired
    public ProcessingServiceFakeImpl(CadrServiceFakeImpl cadrService, TestData data) throws IOException, TesseractException {
        this.cadrService = cadrService;
        this.data = data;

        String userDirectory = new File("").getAbsolutePath();
        this.testdata  = userDirectory + "/testdata";

        this.tesseract =  new Tesseract();

        this.dir = userDirectory ;

        tesseract.setDatapath(this.testdata);
        tesseract.setLanguage("digits_comma");

        this.identifyDirectory();
    }

    public List<Processing> identifyDirectory() throws IOException, TesseractException{

        BasicConfigurator.configure();

        List<Cadr>  cadrs = cadrService.getAll();
        List<Processing> processings = new ArrayList<>();

        AtomicReference<String> recognition = new AtomicReference<>("Failed");

        cadrs.stream().forEach(cadr -> {
            try {
                recognition.set(this.identifyOne(cadr.getPath()));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TesseractException e) {
                e.printStackTrace();
            }
            System.out.println(recognition.toString());
            Processing processing = new Processing( cadr,  recognition.toString().replace("\n","") );
           processing.setQuality(100);
           processing.setSuccess(true);
           processing.setTime(LocalDateTime.now());

            processings.add(processing);

        });

        this.data.setProcessings(processings);

        return  processings;
    }


    public String identifyOne(String img) throws IOException, TesseractException {

        String userDirectory = new File("").getAbsolutePath();

        String url = this.dir + img;

        return this.thesaurus(url);
    }

    private String thesaurus(String url) throws TesseractException {

        File file = new File(url);

        String text  = tesseract.doOCR(file);

        if (text != null) {
            text = text.replace(" ","");
        }

        return (text != null) ? text : "File not found";
    }




    @Override
    public Processing create(Processing processing) {
        return null;
    }

    @Override
    public Processing get(String id) {
        return null;
    }

    @Override
    public Processing update(Processing processing) {
        return null;
    }

    @Override
    public Processing delete(String id) {
        return null;
    }

    @Override
    public List<Processing> getAll() {
        return data.getProcessings();
    }
}
