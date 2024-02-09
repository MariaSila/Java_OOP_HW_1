package Seminar.Sem_1_and_2.vetclinic.Interface;

@FunctionalInterface
public interface Goable {
    double go();
    default void defaultGo(double speed){
        System.out.println("Объект двигается со скоростью " +  speed);
    }

}
