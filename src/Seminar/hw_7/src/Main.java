

import controller.Controller;
import model.Calculable;
import model.Calculator;
import model.ComplexNumber;
import util.Enter;
import view.ViewCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculable<ComplexNumber> calculator = new Calculator();
        Controller<ComplexNumber> controller = new Controller<>(calculator);

        ViewCalculator view = new ViewCalculator(controller, new Enter(new Scanner(System.in)));
        view.run();

    }

}


