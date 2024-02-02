package Seminar.Sem_01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", LocalDate.of(2020, 12, 7), new Illness("Лишай"));
        System.out.println(cat.getName());

        cat.setIllness(new Illness("Здоров"));
        System.out.println(cat.getIllness());

        Dog dog = new Dog("Шарик", LocalDate.of(2021, 4, 16), new Illness("Ушиб"));
        //System.out.println(dog.getAnimalType());

        List<Animal> lst = new ArrayList<>();
        lst.add(dog);
        lst.add(cat);
        lst.add(new Duck("Утя", LocalDate.of(2022, 7, 6), new Illness("Вывих крыла"), 2));
        System.out.println(lst);
        
        dog.lifeCycle();
    }
}
