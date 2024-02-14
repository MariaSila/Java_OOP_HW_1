package src.Seminar.Sem_1_and_2.additional;

public class MainForMathable {
    public static void main(String[] args) {
        //пример лямбда
        Mathable n = (a, b) -> a + b;

        Mathable n1 = Double::sum;
    }
}
