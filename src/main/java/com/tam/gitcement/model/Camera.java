package com.tam.gitcement.model;

import java.util.Objects;

public class Camera {           //  Характеристики самой камеры

    private String id;
    private String name;        //  например iVue-IPC-OB40F28-20
    private Point point;        //  точка где она стоит
    private ViewPlace view;     //  место, которое она сканирует, например,  БОРТ. Может внизу над шасси
    private String desc;

    public Camera() { }

    public Camera(String name, Point point, ViewPlace view, String desc) {
        this.name = name;
        this.point = point;
        this.view = view;
        this.desc = desc;
    }

    public Camera(String id, String name, Point point, ViewPlace view, String desc) {
        this.id = id;
        this.name = name;
        this.point = point;
        this.view = view;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public ViewPlace getView() {
        return view;
    }

    public void setView(ViewPlace view) {
        this.view = view;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       Camera camera = (Camera) o;
        return id == camera.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Camera{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", point=" + point +
                ", view=" + view +
                ", desc='" + desc + '\'' +
                '}';
    }
}
