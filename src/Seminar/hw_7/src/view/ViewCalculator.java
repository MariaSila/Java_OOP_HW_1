package view;


import controller.Controller;
import model.ComplexNumber;
import util.Enter;

public class ViewCalculator {
    private Controller controller;
    private Enter input;

    public ViewCalculator(Controller controller, Enter input) {
        this.controller = controller;
        this.input = input;
    }

    public void run() {
        while (true) {
            prepare();
            String action = input.prompt();
            if (action.equalsIgnoreCase("s")) {
                System.exit(0);
            } else{
                prepare();
            }
        }
    }

    private void prepare() {
        double reA = input.promptComplex("Введите действительную часть первого числа: ");
        double imA = input.promptComplex("Введите мнимую часть первого числа: ");
        String operator = input.getOperator();
        double reB = input.promptComplex("Введите действительную часть второго числа: ");
        double imB = input.promptComplex("Введите мнимую часть второго числа: ");

        ComplexNumber a = new ComplexNumber(reA, imA);
        ComplexNumber b = new ComplexNumber(reB, imB);

        ComplexNumber result;
        switch (operator) {
            case "+":
                result = controller.sum(a, b);
                System.out.println("Результат: " + result.toString());
                break;
            case "-":
                result = controller.sub(a, b);
                System.out.println("Результат: " + result.toString());
                break;
            case "*":
                result =  controller.multy(a, b);
                System.out.println("Результат: " + result.toString());
                break;
            case "/":
                result =  controller.div(a, b);
                System.out.println("Результат: " + result.toString());
                break;
            default:
                System.out.println("Введен не корректный оператор");
                break;
        }


/*        if (operator.equals("+")) {
            controller.sum(a, b);
            controller.result();
            controller.clear();
        }

        if (operator.equals("-")) {
            controller.sub(a, b);
        }

        if (operator.equals("*")) {
            controller.multy(a, b);
        }

        if (operator.equals("/")) {
            controller.div(a, b);
        }*/


    }

}
