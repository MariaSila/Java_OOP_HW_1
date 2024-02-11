package Seminar.Sem_1_and_2.vetclinic.classes;

import Seminar.Sem_1_and_2.vetclinic.Interface.Swimable;

import java.time.LocalDate;

public class Dolphin extends Animal implements Swimable {
    private int finCount;

    public Dolphin(String name, LocalDate birthDate, Illness illness, int finCount) {
        super(name, birthDate, illness);
        this.finCount = finCount;
    }

    public int getFinCount() {
        return finCount;
    }


    @Override
    public double swim() {
        double speed = 100;
        System.out.printf("%s %s плавает со скоростью ", getAnimalType(), this.name);
        return speed;
    }
}
