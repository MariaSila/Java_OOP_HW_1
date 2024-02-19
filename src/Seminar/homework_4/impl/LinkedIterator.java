package src.Seminar.homework_4.impl;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedIterator <E> implements Iterator {
    private Node<E> next;
    private int index;
    private LinkedList<E> ld;


    public LinkedIterator() {
        this.index = index;
        this.ld = ld;
    }

    @Override
    public boolean hasNext() {
        return index < ld.size();
    }

    @Override
    public Object next() {
        return ld.get(index++);
    }
}
