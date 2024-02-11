package Seminar.Sem_1_and_2.vetclinic.classes;
import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected Illness illness;

    public Animal(String name, LocalDate birthDay, Illness illness ) {
        this.name = name;
        this.birthDay = birthDay;
        this.illness = illness;
    }

    public Animal() {

        this("Имя", LocalDate.now(), new Illness("Болезень"));
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public String getName() {
        return name;
    }
    
    public LocalDate getBirthDay() {
        return birthDay;
    }

    public Illness getIllness() {
        return illness;
    }

    public String getAnimalType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("animal = %s, name = %s, birthDay = %s, illness = %s", getAnimalType(), name, birthDay, illness);
    }


}


