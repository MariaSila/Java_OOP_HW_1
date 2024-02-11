package Seminar.Sem_1_and_2.vetclinic.classes;

import Seminar.Sem_1_and_2.vetclinic.Interface.Flyable;
import Seminar.Sem_1_and_2.vetclinic.Interface.Goable;
import Seminar.Sem_1_and_2.vetclinic.Interface.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable, Goable {
    private int wingQuantity;

    public Duck(String name, LocalDate birthDate, Illness illness, int wingQuantity) {
        super(name, birthDate, illness);
        this.wingQuantity = wingQuantity;
    }

    public int getWingQuantity() {
        return wingQuantity;
    }


    @Override
    public double fly() {
        double speed = 10;
        System.out.printf("%s %s летает со скоростью ", getAnimalType(), this.name);
        return speed;
    }

    @Override
    public double run() {
        double speed = 3;
        System.out.printf("%s %s бежит со скоростью ", getAnimalType(), this.name);
        return speed;
    }

    @Override
    public double swim() {
        double speed = 10;
        System.out.printf("%s %s плавает со скоростью ", getAnimalType(), this.name);
        return speed;
    }
}
