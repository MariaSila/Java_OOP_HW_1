package src.Seminar.Sem_1_and_2.vetclinic.personals;

public class Nurse extends Staff{
    protected String name;
    protected Doctor doctor;

    public Nurse(String name, Doctor doctor) {
        this.name = name;
        this.doctor = doctor;
    }

    public void doProcedure(){
        System.out.println("Делает процедуру");
    }

    public String getName() {
        return this.name;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return String.format("Медсестра %s", this.name);
    }
}
