package src.Seminar.Sem_1_and_2.vetclinic;

import src.Seminar.Sem_1_and_2.vetclinic.clients.*;
import src.Seminar.Sem_1_and_2.vetclinic.controllers.Illness;
import src.Seminar.Sem_1_and_2.vetclinic.controllers.VeterinaryClinic;
import src.Seminar.Sem_1_and_2.vetclinic.personals.Doctor;
import src.Seminar.Sem_1_and_2.vetclinic.personals.Nurse;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        VeterinaryClinic.addPatient(new Cat("Барсик", LocalDate.of(2020, 12, 7), new Illness("Лишай")));
        VeterinaryClinic.addPatient(new Dog("Шарик", LocalDate.of(2021, 4, 16), new Illness("Ушиб")));
        VeterinaryClinic.addPatient(new Bat("Блэк", LocalDate.of(2021,4,9), new Illness("Коронавирус"), 2));
        VeterinaryClinic.addPatient(new Dolphin("Лола", LocalDate.of(2019, 6,19), new Illness("ОРВИ"), 3));
        VeterinaryClinic.addPatient(new Penguin("Ковальски", LocalDate.of(2022, 8,5), new Illness("Ушиб"), 2));
        VeterinaryClinic.addPatient(new Duck("Утя", LocalDate.of(2022, 7, 6), new Illness("Вывих крыла"), 2));

        VeterinaryClinic.getGoables();
        VeterinaryClinic.getFlyable();
        VeterinaryClinic.getSwimable();


        VeterinaryClinic.addEmployee(new Doctor("Сильвестр Андреевич Град"));
        VeterinaryClinic.addEmployee(new Nurse("Алевтина Петровна Гвоздева", new Doctor("Сильвестр Андреевич Град")));
        VeterinaryClinic.addEmployee(new Doctor("Михаил Петрович Шпак"));
        VeterinaryClinic.addEmployee(new Nurse("Светлана Ивановна Старкова", new Doctor("Михаил Петрович Шпак")));
        VeterinaryClinic.addEmployee(new Doctor("Иван Николаевич Смирнов"));
        VeterinaryClinic.addEmployee(new Nurse("Надежда Николаевна Бабкина", new Doctor("Иван Николаевич Смирнов")));

        VeterinaryClinic.getDoctors();
        VeterinaryClinic.getNurse();
        VeterinaryClinic.getStaff();

        //working seminar2
        /*List<Goable> goables = new ArrayList<>();
        goables.add(new Cat());
        goables.add(new Dog());

        for (Goable g: goables){
            System.out.println(g.run());
        }


       Goable goable = new Goable() {
            @Override
            public double go() {
                return 0;
            }
        };
        //лямбда
        Goable goable1 = ()-> 19;*/

    }
}
