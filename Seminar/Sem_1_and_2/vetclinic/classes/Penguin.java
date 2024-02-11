package Seminar.Sem_1_and_2.vetclinic.classes;

import Seminar.Sem_1_and_2.vetclinic.Interface.Goable;
import Seminar.Sem_1_and_2.vetclinic.Interface.Swimable;

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
