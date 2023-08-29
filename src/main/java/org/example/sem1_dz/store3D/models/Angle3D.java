package org.example.sem1_dz.store3D.models;

public class Angle3D {

    private int alpha, betta, gamma;
    private int a, b, c;

    public Angle3D(int alpha, int betta, int gamma, int a, int b, int c) {
        this.alpha = alpha;
        this.betta = betta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBetta() {
        return betta;
    }

    public void setBetta(int betta) {
        this.betta = betta;
    }

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
