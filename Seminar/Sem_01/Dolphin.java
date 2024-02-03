package Seminar.Sem_01;

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
    public void canDo() {
        super.canDo();
        swim();
    }
}
