package model;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
        this.re = 0.0;
        this.im = 0.0;
    }

    public ComplexNumber(Double re, Double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public String toString() {
        return re + " + " + im + "i";
    }
}
