package Seminar.Sem_01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Барсик", LocalDate.of(2020, 12, 7), new Illness("Лишай"));
        cat.setIllness(new Illness("Здоров"));

        Animal dog = new Dog("Шарик", LocalDate.of(2021, 4, 16), new Illness("Ушиб"));
        Animal bat = new Bat("Блэк", LocalDate.of(2021,4,9), new Illness("Коронавирус"), 2);
        Animal dolphin = new Dolphin("Лола", LocalDate.of(2019, 6,19), new Illness("ОРВИ"), 3);
        Animal penguin = new Penguin("Ковальски", LocalDate.of(2022, 8,5), new Illness("Ушиб"), 2);
        Animal duck = new Duck("Утя", LocalDate.of(2022, 7, 6), new Illness("Вывих крыла"), 2);

        dog.canDo();
        cat.canDo();
        bat.canDo();
        dolphin.canDo();
        penguin.canDo();
        duck.canDo();


        List<Animal> lst = new ArrayList<>();
        lst.add(dog);
        lst.add(cat);
        lst.add(bat);
        lst.add(dolphin);
        lst.add(penguin);
        lst.add(duck);

/*        for (Animal animal : lst) {
            System.out.println(animal);
        }*/
    }
}
