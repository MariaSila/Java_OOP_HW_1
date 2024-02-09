package Seminar.Sem_1_and_2.vetclinic.classes;

import java.time.LocalDate;

public class Dolphin extends Animal {
    private int finCount;

    public Dolphin(String name, LocalDate birthDate, Illness illness, int finCount) {
        super(name, birthDate, illness);
        this.finCount = finCount;
    }

    public int getFinCount() {
        return finCount;
    }

    @Override
    public void eat() {

    }
}
