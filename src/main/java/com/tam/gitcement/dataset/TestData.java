package com.tam.gitcement.dataset;

import com.tam.gitcement.model.*;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TestData {

   private List<Point> points = new ArrayList<>(

            Arrays.asList(

                    new Point("0", "ENTRANCE", "South"),
                    new Point("1", "ENTRANCE", "West")

            )
    );

   private List<Camera> cameras = new ArrayList<>(
           Arrays.asList(
                   new Camera("0", "iVue-IPC-OB40F28-20", points.get(0), ViewPlace.BOARD, ""),
                   new Camera("1", "iVue-IPC-IT10F36-10", points.get(1), ViewPlace.BOTTOM, "")
           )
   );

   private List<Path> paths = new ArrayList<>(
     Arrays.asList()
   );


    private List<Cadr>  cadrs = new ArrayList<>(
            Arrays.asList(


                    new Cadr("1", "pf04.png", LocalDateTime.now(), cameras.get(0), "/storage/pf04.png"),
                    new Cadr("2", "pf07.png", LocalDateTime.now(), cameras.get(0), "/storage/pf07.png"),
                    new Cadr("3", "pf16.png", LocalDateTime.now(), cameras.get(0), "/storage/pf16.png"),
                    new Cadr("4", "pf18.png", LocalDateTime.now(), cameras.get(1), "/storage/pf18.png"),
                    new Cadr("5", "pf29.png", LocalDateTime.now(), cameras.get(1), "/storage/pf29.png")
            )

    );


    private List<Processing>  processings = new ArrayList<>(

            Arrays.asList()
    );

    //------------------------------------------------------------------------------------



    public List<Point> getPoints() {
        return points;
    }

    public Point setPoint(Point point){
        Integer size = this.points.size();
        point.setId(size.toString());
        this.points.add(point);
        return point;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public List<Camera> getAllCameras(){
        return this.cameras;
    }

    public Camera getCamera(String id){
        return this.cameras
                .stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Camera setCamera(Camera camera){
        Integer size = this.cameras.size();
        camera.setId(size.toString());
        this.cameras.add(camera);
        return camera;
    }

    public Camera delete(String id){
        Camera camera = this.getCamera(id);
        Point point = camera.getPoint();
        points.remove(point);
        cameras.remove(camera);
        return camera;
    }


    public List<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(List<Camera> cameras) {
        this.cameras = cameras;
    }

    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }

    public List<Cadr> getCadrs() {
        return cadrs;
    }

    public void setCadrs(List<Cadr> cadrs) {
        this.cadrs = cadrs;
    }

    public List<Processing> getProcessings() {
        return processings;
    }

    public void setProcessings(List<Processing> processings) {
        this.processings = processings;
    }
}
