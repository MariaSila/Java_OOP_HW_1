package src.Seminar.Sem_1_and_2.vetclinic.clients;

import src.Seminar.Sem_1_and_2.vetclinic.properties.Goable;
import src.Seminar.Sem_1_and_2.vetclinic.properties.Swimable;
import src.Seminar.Sem_1_and_2.vetclinic.controllers.Animal;
import src.Seminar.Sem_1_and_2.vetclinic.controllers.Illness;

import java.time.LocalDate;

public class Penguin extends Animal implements Swimable, Goable {
    private int wingQuantity;
    public Penguin(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }

    @Override
    public double run() {
        double speed = 5;
        System.out.printf("%s %s бежит со скоростью ", getAnimalType(), this.name);
        return speed;
    }

    @Override
    public double swim() {
        double speed = 70;
        System.out.printf("%s %s плавает со скоростью ", getAnimalType(), this.name);
        return speed;
    }
}
