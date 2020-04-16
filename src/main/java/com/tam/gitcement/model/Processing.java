package com.tam.gitcement.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Processing {  //  обработка кадра (распознавание)

    private String id;
    private LocalDateTime time;     //  время обработки. Не путать со временем кадра
    private Cadr cadr;            // собственно сам кадр
    private  String number;        //  номер вагона, который получился в результате распознавания.
    private int quality;           //  качество распознавание. В диапазоне 1 ... 100
    private boolean success;      //  номер распознан корректно. То есть валидирован - прошел сравнение с заявкой.


    public Processing() { }

    public Processing(Cadr cadr, String number) {
        this.cadr = cadr;
        this.number = number;
    }

    public Processing(LocalDateTime time, Cadr cadr, String number, int quality, boolean success) {
        this.time = time;
        this.cadr = cadr;
        this.number = number;
        this.quality = quality;
        this.success = success;
    }

    public Processing(String id, LocalDateTime time, Cadr cadr, String number, int quality, boolean success) {
        this.id = id;
        this.time = time;
        this.cadr = cadr;
        this.number = number;
        this.quality = quality;
        this.success = success;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Cadr getCadr() {
        return cadr;
    }

    public void setCadr(Cadr cadr) {
        this.cadr = cadr;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processing that = (Processing) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Processing{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", cadr=" + cadr +
                ", number='" + number + '\'' +
                ", quality=" + quality +
                ", success=" + success +
                '}';
    }
}
