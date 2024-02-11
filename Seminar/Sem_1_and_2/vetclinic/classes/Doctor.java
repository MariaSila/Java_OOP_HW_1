package Seminar.Sem_1_and_2.vetclinic.classes;

public class Doctor extends Staff{
    private String name;
    protected Nurse nurse;

    public Doctor(String name, Nurse nurse) {
        this.name = name;
        this.nurse = nurse;
    }

    public Doctor(String name) {
        this.name = name;
    }

    public Doctor() {
        this("Имя Доктора");
    }

    public void doDiagnose() {
        System.out.println("Ставит диагноз");
    }
    public String getName() {
        return name;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public String toString() {
        return String.format("Доктор %s", this.name);
    }
}
