package Seminar.Sem_1_and_2.vetclinic.classes;

import java.time.LocalDate;

public class Penguin extends Animal{
    private int wingQuantity;
    public Penguin(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }

    @Override
    public void eat() {

    }
}
