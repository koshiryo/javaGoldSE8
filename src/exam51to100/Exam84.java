package exam51to100;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exam84 {

    public static void main(String[] args) throws Exception {
        List<String> colors = Arrays.asList("red", "green", "yellow");
        Predicate<String> test = n -> {
            System.out.println("Searching…");
            return n.contains("red");
        };
//        Predicate<String> test2 = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return false;
//            }
//        };
        colors.stream()
                .filter(c -> c.length() > 3)
                .allMatch(test);

    }
}
