package Seminar.Sem_01;

import java.time.LocalDate;

public class Duck extends Animal{
    private int wingQuantity;

    public Duck(String name, LocalDate birthDate, Illness illness, int wingQuantity) {
        super(name, birthDate, illness);
        this.wingQuantity = wingQuantity;
    }

    public int getWingQuantity() {
        return wingQuantity;
    }

    @Override
    public String toString() {
        return String.format("Animal: %s, %s, %s, %s, %d", this.getType(), getName(), getIllness(), getBirthDay(), this.getWingQuantity());
    }

    private String getType() {
        return getClass().getSimpleName();
    }


}
