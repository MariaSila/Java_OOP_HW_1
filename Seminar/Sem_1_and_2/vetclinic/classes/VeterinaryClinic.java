package Seminar.Sem_1_and_2.vetclinic.classes;

import Seminar.Sem_1_and_2.vetclinic.Interface.Flyable;
import Seminar.Sem_1_and_2.vetclinic.Interface.Goable;
import Seminar.Sem_1_and_2.vetclinic.Interface.Swimable;

import java.util.*;

public class VeterinaryClinic {
    protected static List<Animal> patients = new ArrayList<>();
    protected static List<Staff> staff = new ArrayList<>();

    public static void addPatient(Animal animal){
        patients.add(animal);
    }

    public static void addEmployee(Staff employee){
        staff.add(employee);
    }

    public static void getGoables(){
        for (int i = 0; i < patients.size(); i++) {
            Animal a = patients.get(i);
            try {
                System.out.println(((Goable) a).run());
            } catch (ClassCastException e) {
                i++;
            }
        }
        System.out.println();
    }

    public static void getFlyable(){
        for (int i = 0; i < patients.size(); i++) {
            Animal f = patients.get(i);
            try {
                System.out.println(((Flyable) f).fly());
            }catch (ClassCastException e) {
                i++;
            }
        }
        System.out.println();
    }

    public static void getSwimable(){
        for (int i = 0; i < patients.size(); i++) {
            Animal s = patients.get(i);
            try {
                System.out.println(((Swimable) s).swim());
            }catch (ClassCastException e){
                i++;
            }
        }
        System.out.println();
    }

    public static void getDoctors(){
        for (int i = 0; i <staff.size(); i++) {
            Staff employee = staff.get(i);
            if(employee instanceof Doctor){
                System.out.println(employee);
            }
        }
        System.out.println();
    }

    public static void getNurse(){
        for (int i = 0; i < staff.size(); i++) {
            Staff employee = staff.get(i);
            if (employee instanceof Nurse){
                System.out.println(employee);
            }
        }
        System.out.println();
    }

    public static void getStaff(){
        getDoctors();
        getNurse();
    }

}
