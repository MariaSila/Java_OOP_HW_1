package src.Seminar.Sem_3.drugstore;


import src.Seminar.Sem_3.drugstore.components.Component;
import src.Seminar.Sem_3.drugstore.components.Penicillin;
import src.Seminar.Sem_3.drugstore.components.Salt;
import src.Seminar.Sem_3.drugstore.components.Water;
import src.Seminar.Sem_3.drugstore.pharmacy.Pharmacy;
import src.Seminar.Sem_3.drugstore.pharmacy.PharmacyIterable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MainApp {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy
                .addComponent(new Penicillin("Component", 2.0, 10))
                .addComponent(new Water("Water", 5.0, 100));

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2
                .addComponent(new Salt("Salt", 10.0, 50));

        Iterator<Component> iter = pharmacy; // Pharmacy является итератором (т.к. имплементирован интерфейс Iterator) и классом Pharmacy = полиморфизм

        // в Iterator метод while
/*        while (iter.hasNext()){
            System.out.println(iter.next());
        }*/

        PharmacyIterable components = new PharmacyIterable();
        components
                .addComponent(new Penicillin("Component", 2.0, 10))
                .addComponent(new Salt("Salt", 10.0, 50))
                .addComponent(new Water("Water", 5.0, 100));

        //в Interable метод foreach
/*        for (Component c : components) {
            System.out.println(c);
        }*/

        //чтобы работал fori надо в классе дописать недостающие методы
/*        for (int i = 0; i < components.getSize(); i++) {
            System.out.println(components.getComponent(i));
        }*/

        PharmacyIterable p1 = new PharmacyIterable();
        p1
                .addComponent(new Penicillin("Penicillin", 2.0, 10))
                .addComponent(new Salt("Salt", 10.0, 50))
                .addComponent(new Water("Water", 5.0, 100));

        PharmacyIterable p2 = new PharmacyIterable();
        p2
                .addComponent(new Penicillin("Penicillin", 2.0, 10))
                .addComponent(new Salt("Salt", 20.0, 70))
                .addComponent(new Water("Water", 5.0, 100));

        PharmacyIterable p3 = new PharmacyIterable();
        p3
                .addComponent(new Penicillin("Penicillin", 2.0, 10))
                .addComponent(new Salt("Salt", 20.0, 70))
                .addComponent(new Water("Water", 5.0, 100));

        ArrayList<PharmacyIterable> pharmacyIterables = new ArrayList<>();
        pharmacyIterables.add(p1);
        pharmacyIterables.add(p2);
        pharmacyIterables.add(p3);

        //код ниже не будет работать, т.к. Java не знает как сортировать сложные объекты
        //Collections.sort(pharmacyIterables);


        //в классе Component имплементирован интерфейс Comparable и переопределен метод compareTo
        //поэтому Collections.sort работать будет
        Component c1 = new Penicillin("p", 25, 120);
        Component c2 = new Water("w", 25, 34);
        Component c3 = new Salt("s", 25, 1);

        ArrayList<Component> components1 = new ArrayList<>();
        components1.add(c1);
        components1.add(c2);
        components1.add(c3);
        components1.add(c1);
        System.out.println(components1);
        //Collections.sort(components1);
        //System.out.println(components1);

        //В классе Component сортировка в compareTo по возрастанию.
        //Чтобы сделать по убыванию можно использовать Comparator.reverseOrder()
        // А также можно использовать лямбду
        Collections.sort(components1, Comparator.reverseOrder());
        System.out.println(components1);


    }

}