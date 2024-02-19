package src.Seminar.homework_4.impl;

public class Node<E> {
    private E currentElem;
    private Node<E> prevElem;
    private Node<E> nextElem;

    public Node(E currentElem, Node<E> prevElem, Node<E> nextElem) {
        this.currentElem = currentElem;
        this.prevElem = prevElem;
        this.nextElem = nextElem;
    }

    public E getCurrentElem() {
        return currentElem;
    }

    public Node<E> getPrevElem() {
        return prevElem;
    }

    public Node<E> getNextElem() {
        return this.nextElem;
    }


    public void setCurrentElem(E currentElem) {
        this.currentElem = currentElem;
    }

    public void setPrevElem(Node<E> prevElem) {
        this.prevElem = prevElem;
    }

    public void setNextElem(Node<E> nextElem) {
        this.nextElem = nextElem;
    }
}
