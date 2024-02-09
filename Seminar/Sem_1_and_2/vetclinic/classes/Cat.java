package Seminar.Sem_1_and_2.vetclinic.classes;

import Seminar.Sem_1_and_2.vetclinic.Interface.Goable;
import Seminar.Sem_1_and_2.vetclinic.Interface.Huntable;

import java.time.LocalDate;

public class Cat extends Animal implements Huntable, Goable {
     public Cat(String name, LocalDate birthDate, Illness illness){
         super(name, birthDate, illness);
     }

    public Cat() {
    }

    @Override
    public void eat() {

    }

    @Override
    public double go() {
        return 5;
    }
}
