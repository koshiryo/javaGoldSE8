package exam101to150;

import java.util.ArrayDeque;
import java.util.Deque;

public class Exam115 {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        queue.add("Susan");
        queue.add("Allen");
        System.out.println(queue);
        queue.add("David");
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
