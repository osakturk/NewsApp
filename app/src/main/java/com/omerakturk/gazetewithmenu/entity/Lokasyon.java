package com.omerakturk.gazetewithmenu.entity;

/**
 * Created by Ömer Aktürk on 16.10.2017.
 */

public class Lokasyon  {
    private long id;

    private double enlem;
    private double boylam;
    private double rakim;

    public Lokasyon() {
    }
    public Lokasyon(long id, double enlem, double boylam, double rakim) {
        this.id = id;
        this.enlem = enlem;
        this.boylam = boylam;
        this.rakim = rakim;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getEnlem() {
        return enlem;
    }

    public void setEnlem(double enlem) {
        this.enlem = enlem;
    }

    public double getBoylam() {
        return boylam;
    }

    public void setBoylam(double boylam) {
        this.boylam = boylam;
    }

    public double getRakim() {
        return rakim;
    }

    public void setRakim(double rakim) {
        this.rakim = rakim;
    }
}
