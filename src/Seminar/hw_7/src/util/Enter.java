package util;

import java.util.Scanner;

public class Enter {
    private final Scanner scanner;

    public Enter(Scanner scanner) {
        this.scanner = scanner;
    }

    public double promptComplex(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        double input = in.nextDouble();
        return input;
    }

    public String getOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the math operation (*, +, /, -) : ");
        String operator = scanner.nextLine();
        return operator;
    }

    public String prompt() {
        Scanner in = new Scanner(System.in);
        System.err.println("Чтобы продолжить нажмите любую клавишу");
        System.err.println("Чтобы выйти нажмити s");
        return in.nextLine();
    }
}
