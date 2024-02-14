package src.Seminar.Sem_1_and_2.additional;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    //Ключ-символ Character (операция, код операции),
    // значение-интерфейс Calculable(принимающий переменное(можно задать любое) кол-во
    // аргументов double(тип указан в интерфейсе) или по другому сказать массив аргументов)
    static Map<Character, Calculable> map = new HashMap<>();
    static {
        map.put('+', arr -> arr[0] + arr[1]);
        map.put('-', arr -> arr[0] - arr[1]);
        map.put('*', arr -> arr[0] * arr[1]);
        map.put('/', arr -> arr[0] / arr[1]);
        map.put('s', arr -> Math.sqrt(arr[0]));
    }

    //запись String[] args равносильно записи String ... args
    public static void main(String ... args) {
    // System.out.println(calculate(1, 2, '/')); // вызов обычного метода (switch case)
        System.out.println(calculateWithMap(9, 2, 's'));
    }

    public static double calculateWithMap(double a, double b, char op) {
        return map.get(op).calculate(a, b); // по ключу оператор выполнить метод calculate
    }

    // обычный способ через switch case
/*    public static double calculate(double a, double b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new UnsupportedOperationException("Not implemented");
        };
    }*/

}

