package Seminar.Sem_1_and_2.vetclinic.classes;

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
    public void eat() {

    }
}
