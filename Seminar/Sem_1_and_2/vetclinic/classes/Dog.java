package Seminar.Sem_1_and_2.vetclinic.classes;

import Seminar.Sem_1_and_2.vetclinic.Interface.Goable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {

    public Dog(String name, LocalDate birthDate, Illness illness) {

        super(name, birthDate, illness);
    }

    public Dog() {
    }

    @Override
    public void eat() {

    }

    @Override
    public double go() {
        return 7;
    }
}
