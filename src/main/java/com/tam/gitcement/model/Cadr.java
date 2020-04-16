package com.tam.gitcement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Cadr {   //  кадр, который снимает камеры наблюдения. Пока что будет 10 кадров в сек

    @Id
    private  String id;
    private String name;   //  в имени будет зашитo время кадра и камера, которая его сняла
    private LocalDateTime time;  //    время съема кадра. Точность милисекунды.
    private Camera camera;        //  камера, кторая сделала этот кадр
    private String path;            // папка, которая хранит этот JPEG кадр.
    String desc;
    LocalDateTime createdAt;
    LocalDateTime modifiedAt;

    public Cadr() {}

    public Cadr(String name, LocalDateTime time, Camera camera, String path) {
        this.name = name;
        this.time = time;
        this.camera = camera;
        this.path = path;
    }

    public Cadr(String id, String name, LocalDateTime time, Camera camera, String path) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.camera = camera;
        this.path = path;
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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Path getUrl(){
        return Paths.get(this.getPath(), this.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cadr cadr = (Cadr) o;
        return getId().equals(cadr.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Cadr{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", camera=" + camera +
                ", path=" + path +
                ", desc='" + desc + '\'' +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }
}
