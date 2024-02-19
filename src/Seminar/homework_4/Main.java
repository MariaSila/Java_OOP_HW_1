package src.Seminar.homework_4;

import src.Seminar.homework_4.impl.LinkedContainer;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> link = new LinkedContainer<>();
        link.addLast("5");
        link.addLast("22");
        link.addLast("1");
        link.addFirst("khk");
        System.out.println(link.size());
        System.out.println(link.getElementByIndex(2));
/*        for (String l: link){
            System.out.println(l);
        }*/
    }
}
