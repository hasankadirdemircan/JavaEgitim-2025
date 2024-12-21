package list;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {
        Deque<String> animals = new LinkedList<>();

        animals.add("Cow");
        System.out.println("LinkedList : " + animals);

        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst() : "  + animals);

        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals);

        animals.peek();
        animals.poll();
        System.out.println("LinkedList after poll(): " + animals);

      //  animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removeFirst() : " + animals);
    }
}
