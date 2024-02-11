package Seminar.Sem_1_and_2.vetclinic.classes;

import Seminar.Sem_1_and_2.vetclinic.Interface.Flyable;
import Seminar.Sem_1_and_2.vetclinic.Interface.Goable;

import java.time.LocalDate;

public class Bat extends Animal implements Flyable, Goable {
    private int wingQuantity;

    public Bat(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }

    public int getWingQuantity() {
        return wingQuantity;
    }

    @Override
    public double fly() {
        double speed = 20;
        System.out.printf("%s %s летает со скоростью ", getAnimalType(), this.name);
        return speed;
    }

    @Override
    public double run() {
        double speed = 5;
        System.out.printf("%s %s бежит со скоростью ", getAnimalType(), this.name);
        return speed;
    }
}
