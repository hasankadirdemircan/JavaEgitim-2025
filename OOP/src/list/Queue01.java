package list;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    public static void main(String[] args) {
        Queue<String> languages = new LinkedList<>();

        languages.add("Python");
        languages.add("Java");
        languages.add("C");
        System.out.println("LinkedList: " + languages);

        String str1 = languages.peek();
        System.out.println(str1);
        String str2 = languages.poll();
        System.out.println("removed element: " + str2);
        System.out.println("LinkedList after poll() : " + languages);
        System.out.println(languages.peek());
        languages.poll();

        System.out.println("LinkedList after poll() : " + languages);
    }
}
