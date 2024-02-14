package src.Seminar.Sem_1_and_2.vetclinic.clients;

import src.Seminar.Sem_1_and_2.vetclinic.properties.Flyable;
import src.Seminar.Sem_1_and_2.vetclinic.properties.Goable;
import src.Seminar.Sem_1_and_2.vetclinic.controllers.Animal;
import src.Seminar.Sem_1_and_2.vetclinic.controllers.Illness;

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
