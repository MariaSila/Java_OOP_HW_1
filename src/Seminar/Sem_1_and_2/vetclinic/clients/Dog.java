package src.Seminar.Sem_1_and_2.vetclinic.clients;

import src.Seminar.Sem_1_and_2.vetclinic.properties.Goable;
import src.Seminar.Sem_1_and_2.vetclinic.properties.Swimable;
import src.Seminar.Sem_1_and_2.vetclinic.controllers.Animal;
import src.Seminar.Sem_1_and_2.vetclinic.controllers.Illness;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {

    public Dog(String name, LocalDate birthDate, Illness illness) {

        super(name, birthDate, illness);
    }

    @Override
    public double run() {
        double speed = 22;
        System.out.printf("%s %s бежит со скоростью ", getAnimalType(), this.name);
        return speed;
    }

    @Override
    public double swim() {
        double speed = 3;
        System.out.printf("%s %s плавает со скоростью ", getAnimalType(), this.name);
        return speed;
    }
}
