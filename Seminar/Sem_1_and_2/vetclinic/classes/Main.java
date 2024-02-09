package Seminar.Sem_1_and_2.vetclinic.classes;

import Seminar.Sem_1_and_2.vetclinic.Interface.Goable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Goable> goables = new ArrayList<>();
        goables.add(new Cat());
        goables.add(new Dog());

        for (Goable g: goables){
            System.out.println(g.go());
            g.defaultGo(10d);
        }

        Goable goable = new Goable() {
            @Override
            public double go() {
                return 0;
            }
        };
        //лямбда
        Goable goable1 = ()-> 19;

        //System.out.println(goables);

        Animal cat = new Cat("Барсик", LocalDate.of(2020, 12, 7), new Illness("Лишай"));
        cat.setIllness(new Illness("Здоров"));

        Animal dog = new Dog("Шарик", LocalDate.of(2021, 4, 16), new Illness("Ушиб"));
        Animal bat = new Bat("Блэк", LocalDate.of(2021,4,9), new Illness("Коронавирус"), 2);
        Animal dolphin = new Dolphin("Лола", LocalDate.of(2019, 6,19), new Illness("ОРВИ"), 3);
        Animal penguin = new Penguin("Ковальски", LocalDate.of(2022, 8,5), new Illness("Ушиб"), 2);
        Animal duck = new Duck("Утя", LocalDate.of(2022, 7, 6), new Illness("Вывих крыла"), 2);

        List<Animal> lst = new ArrayList<>();
        lst.add(dog);
        lst.add(cat);
        lst.add(bat);
        lst.add(dolphin);
        lst.add(penguin);
        lst.add(duck);
    }
}
