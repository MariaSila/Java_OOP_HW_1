package model;

public class Calculator implements Calculable<ComplexNumber> {


    public Calculator() {
    }

    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        double re = a.getRe() + b.getRe();
        double im = a.getIm() + b.getIm();
        return new ComplexNumber(re, im);
    }

    @Override
    public ComplexNumber sub(ComplexNumber a, ComplexNumber b) {
        double re = a.getRe() - b.getRe();
        double im = a.getIm() - b.getIm();
        return new ComplexNumber(re, im);
    }

    @Override
    public ComplexNumber multy(ComplexNumber a, ComplexNumber b) {
        double re = a.getRe() * b.getRe() - a.getIm() * b.getIm();
        double im = a.getIm() * b.getRe() + a.getRe() * b.getIm();
        return new ComplexNumber(re, im);
    }

    @Override
    public ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        double divider = Math.pow(b.getRe(), 2) + Math.pow(b.getIm(), 2);
        double re = (a.getRe() * b.getRe() + a.getIm() * b.getIm()) / divider;
        double im = (a.getIm() * b.getRe() - a.getRe() * b.getIm()) / divider;
        return new ComplexNumber(re, im);
    }

}
