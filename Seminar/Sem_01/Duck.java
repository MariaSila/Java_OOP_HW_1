package Seminar.Sem_01;

import java.time.LocalDate;

public class Duck extends Animal{
    private int wingQuantity;

    public Duck(String name, LocalDate birthDate, Illness illness, int wingQuantity) {
        super(name, birthDate, illness);
        this.wingQuantity = wingQuantity;
    }

    public int getWingQuantity() {
        return wingQuantity;
    }

    @Override
    public void canDo() {
        super.canDo();
        toGo();
        fly();
        swim();
    }
}
