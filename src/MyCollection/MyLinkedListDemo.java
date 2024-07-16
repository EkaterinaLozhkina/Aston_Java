package MyCollection;

import java.util.Arrays;


public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(7);
        list.add(5);
        list.add(3);
        list.add(1);

        System.out.println("Size: " + list.size());

        System.out.println(list.get(3));

        list.addAll(Arrays.asList(10, 2, 6, 4));
        list.printList();

        list.remove(5);
        list.printList();

        list.bubbleSort();
        list.printList();
    }
}
