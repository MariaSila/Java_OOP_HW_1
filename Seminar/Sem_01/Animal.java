package Seminar.Sem_01;
import java.time.LocalDate;

public class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected Illness illness;

    public Animal(String name, LocalDate birthDay, Illness illness ) {
        this.name = name;
        this.birthDay = birthDay;
        this.illness = illness;
    }

    public Animal() {
        this("Вася", LocalDate.now(), new Illness("Болезень"));
    }

    private void wakeUp() {
        System.out.println(getAnimalType() + " проснулся");
    }

    private void hunt() {
        System.out.println(getAnimalType() + " охотится");
    }

    private void eat() {
        System.out.println(getAnimalType() + " кушает");
    }

    private void sleep() {
        System.out.println(getAnimalType() + " спит");
    }

    public void lifeCycle() {
        wakeUp();
        hunt();
        eat();
        sleep();
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
        return String.format("name = %s, birthDay = %s, illness = %s", name, birthDay, illness);
    }


}

