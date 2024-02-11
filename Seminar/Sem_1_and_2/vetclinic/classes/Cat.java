package Seminar.Sem_1_and_2.vetclinic.classes;

import Seminar.Sem_1_and_2.vetclinic.Interface.Goable;
import Seminar.Sem_1_and_2.vetclinic.Interface.Swimable;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Swimable {
    public Cat(String name, LocalDate birthDate, Illness illness){
         super(name, birthDate, illness);
    }

    @Override
    public double run() {
        double speed = 15;
        System.out.printf("%s %s бежит со скоростью ", getAnimalType(), this.name);
        return speed;
    }

    @Override
    public double swim() {
        double speed = 2;
        System.out.printf("%s %s плавает со скоростью ", getAnimalType(), this.name);
        return speed;
    }
}
