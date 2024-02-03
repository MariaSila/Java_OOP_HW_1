package Seminar.Sem_01;

import java.time.LocalDate;

public class Bat extends Animal{
    private int wingQuantity;

    public Bat(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }

    public int getWingQuantity() {
        return wingQuantity;
    }

    @Override
    public void canDo() {
        super.canDo();
        fly();
        toGo();
    }
}
