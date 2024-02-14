package src.Seminar.Sem_3.drugstore.pharmacy;


import src.Seminar.Sem_3.drugstore.components.Component;
import src.Seminar.Sem_3.drugstore.components.MyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyIterable implements Iterable<Component>, Comparable<PharmacyIterable>{
    private List<Component> components;
    private int idx;
    private int size = 0;

    public PharmacyIterable() {
        this.components = new ArrayList<>();
        this.idx = 0;
    }

    public PharmacyIterable addComponent(Component item) {
        size++;
        components.add(item);
        return this;
    }
   public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getSize() {
        return size;
    }

    public int getIdx() {
        return idx;
    }

    public List<Component> getComponents() {
        return components;
    }

    public Component getComponent(int idx) {
        return components.get(idx);
    }

    public double getTotalWeight(){
        double result = 0;
        for (Component c : components) {
            result += c.getWeight();
        }
        return result;
    }

    public int getTotalPower() {
        int result = 0;
        for (Component c : components) {
            result += c.getPower();
        }
        return result;
    }

    @Override
    public int compareTo(PharmacyIterable o) {
        return Integer.compare(this.getTotalPower(), o.getTotalPower());
    }

    @Override
    public Iterator<Component> iterator() {
        //1 способ реализации через анонимный класс
  /*      return new Iterator<Component>() { // создаем анонимный класс
            @Override
            public boolean hasNext() {
                return idx < components.size();
            }

            @Override
            public Component next() {
                return components.get(idx++);
            }
        };*/
        // 2 способ через MyIterator
        return new MyIterator(this);
    }

    @Override
    public String toString() {
        return String.format("\ntotal weight: %s total power: %s", this.getTotalWeight(), this.getTotalPower());
    }
}