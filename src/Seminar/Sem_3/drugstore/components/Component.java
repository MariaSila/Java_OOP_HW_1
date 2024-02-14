package src.Seminar.Sem_3.drugstore.components;

public abstract class Component implements Comparable<Component> {
    private String title;
    private double weight;
    private int power;

    public Component(String title, double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public double getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, power: %s\n", this.title, this.power);
    }

    @Override
    public int compareTo(Component component) {
        //сортировка по возрастанию
/*        if (this.power > component.power) return 1;
        else if (this.power < component.power) return -1;
        else return 0;*/
        //код ниже вариант короткой записи трех строчек кода выше
        return Integer.compare(this.power, component.power);

        //сортировка по убыванию
        //1 способ поменять знаки в условии
/*        if (this.power < component.power) return 1;
        else if (this.power > component.power) return -1;
        else return 0;  */

        //2 способ поменять значения в return
/*        if (this.power > component.power) return -1;
        else if (this.power < component.power) return 1;
        else return 0;*/

        //3 способ поменять местами аргументы
/*        //код ниже вариант короткой записи трех строчек кода выше
        return Integer.compare(component.power, this.power);*/
    }
}