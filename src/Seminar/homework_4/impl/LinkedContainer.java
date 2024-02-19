package src.Seminar.homework_4.impl;

import src.Seminar.homework_4.MyLinkedList;

import java.util.Iterator;

public class LinkedContainer<E> implements MyLinkedList<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;
    private Node<E> next;
    private int nextIndex;

    public LinkedContainer() {
        this.firstNode = new Node<E>(null, null, lastNode);
        this.lastNode = new Node<E>(null, firstNode, null);
        this.size = 0;
    }

    @Override
    public void addLast(E elem) {
        Node<E> temp = lastNode;
        temp.setCurrentElem(elem);
        lastNode = new Node<E>(null, temp, null);
        temp.setNextElem(lastNode);
        size++;
    }

    @Override
    public void addFirst(E elem) {
        Node<E> temp = firstNode;
        temp.setCurrentElem(elem);
        firstNode = new Node<E>(null, null, temp);
        temp.setPrevElem(temp);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElem();
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = firstNode.getNextElem();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElem();
    }
    @Override
    public Iterator<E> iterator() {
        return new LinkedIterator<>();
    }



/*    public E get(int index) {
        if (index < size) {
            Node<E> x = firstNode;
            for (int i = 0; i < index; i++){
                x = x.getNextElem();
            }
            return x.getCurrentElem();
        } else {
            Node<E> x = lastNode;
            for (int i = size - 1; i > index; i--){
                x = x.getPrevElem();
            }
            return x.getCurrentElem();
        }*/

}
