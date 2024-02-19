package src.Seminar.homework_4;

public interface MyLinkedList<E> extends Iterable<E>{
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int index);

}
