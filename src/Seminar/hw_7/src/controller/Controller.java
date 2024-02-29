package controller;


import model.Calculable;
import model.ComplexNumber;

public class Controller <T>{
    private Calculable<ComplexNumber> calculator;

    public Controller(Calculable<ComplexNumber> calculator) {
        this.calculator = calculator;
    }

    public ComplexNumber sum (ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.sum(a, b);
        return result;
    }

    public ComplexNumber sub (ComplexNumber a, ComplexNumber b){
        ComplexNumber result = calculator.sub(a, b);
        return result;
    }

    public ComplexNumber multy (ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.multy(a, b);
        return result;
    }

    public ComplexNumber div (ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.div(a, b);
        return result;
    }


}
