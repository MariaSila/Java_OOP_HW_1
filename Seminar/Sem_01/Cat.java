package Seminar.Sem_01;

import java.time.LocalDate;

public class Cat extends Animal{
     public Cat(String name, LocalDate birthDate, Illness illness){
         super(name, birthDate, illness);
     }

    @Override
    public void canDo() {
        super.canDo();
        toGo();
        swim();
    }
}
