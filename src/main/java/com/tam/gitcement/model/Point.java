package com.tam.gitcement.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Point {  //  точка, где стоит камера,  например  НА ВЪЕЗДЕ

    @Id
    private String id;
    private String name;
    private String desc;
    LocalDateTime createdAt;
    LocalDateTime modifiedAt;

    public Point() {
    }

    public Point(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public Point(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Point(String id, String name, String desc, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
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

    @Override
    public String toString() {
        return "Point{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return getId().equals(point.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
