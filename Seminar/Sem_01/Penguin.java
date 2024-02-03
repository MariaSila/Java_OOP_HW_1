package Seminar.Sem_01;

import java.time.LocalDate;

public class Penguin extends Animal{
    private int wingQuantity;
    public Penguin(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }

    @Override
    public void canDo() {
        super.canDo();
        toGo();
        swim();
    }
}
