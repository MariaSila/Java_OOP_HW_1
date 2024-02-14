package src.Seminar.Sem_1_and_2.vetclinic.clients;

import src.Seminar.Sem_1_and_2.vetclinic.properties.Goable;
import src.Seminar.Sem_1_and_2.vetclinic.properties.Swimable;
import src.Seminar.Sem_1_and_2.vetclinic.controllers.Animal;
import src.Seminar.Sem_1_and_2.vetclinic.controllers.Illness;

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
