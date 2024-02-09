package Seminar.Sem_1_and_2.vetclinic.classes;

public class Illness {
    String name;

    public Illness(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
