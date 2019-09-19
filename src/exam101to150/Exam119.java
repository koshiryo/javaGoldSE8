package exam101to150;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exam119 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("win", "try", "best", "luck", "do");
        Predicate<String> test1 = w -> {
            System.out.println("Checking...");
            return w.equals("do");        //line n1
        };
        Predicate<String> test2 = w -> w.length() > 3;//line n2
        long count = words.stream()
                .filter(test2)
                .filter(test1)
                .count();
        System.out.println(count);
    }


}
