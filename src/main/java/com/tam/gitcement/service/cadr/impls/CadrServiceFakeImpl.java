package com.tam.gitcement.service.cadr.impls;

import com.tam.gitcement.dataset.TestData;
import com.tam.gitcement.model.Cadr;
import com.tam.gitcement.service.cadr.interfaces.ICadrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CadrServiceFakeImpl implements ICadrService {

    private final TestData data;

    @Autowired
    public CadrServiceFakeImpl(TestData data) {
        this.data = data;
    }

    @Override
    public Cadr create(Cadr cadr) {
        return null;
    }

    @Override
    public Cadr get(String id) {
        /*return  this.getAll().stream().filter(item->item.getId().equals(id))
                .findFirst().orElse(null);*/
        return null;
    }

    @Override
    public Cadr update(Cadr cadr) {
        return null;
    }

    @Override
    public Cadr delete(String id) {
        return null;
    }

    @Override
    public List<Cadr> getAll() throws IOException {
        List<Cadr> cadr = data.getCadrs();

        /*
        String userDirectory = new File("").getAbsolutePath();
        System.out.println(userDirectory);

        Set<String> nameFile = this.listFilesUsingJavaIO(userDirectory + "/storage");
        System.out.println(nameFile);

        for (String item : nameFile) {
            String url = userDirectory + "/storage/" + item;
            System.out.println(url);

            for (Cadr searchItem : cadr) {
                if(searchItem.getName().equals(item)){
                    searchItem.setPath("/storage/" + item);
                }
            }

        BufferedImage image = ImageIO.read(new File(url));
            System.out.println(image);
        }
        */

        return cadr;
    }

    public Set<String> listFilesUsingJavaIO(String dir) {
        return Stream.of(new File(dir).listFiles())
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .collect(Collectors.toSet());
    }
}
