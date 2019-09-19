package exam101to150;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Exam138 {


    public static void main(String[] args) {
		BiPredicate<String, String> bp = (String s1, String s2) -> s1.contains("SG") &&
        s2.contains("Java");
        BiFunction<String, String, Integer> bf = (String s1, String s2) -> {
            int fee = 0;
            if (bp.test(s1, s2)) {
                fee = 100;
            }
            return fee;
        };
        int feel = bf.apply("D101SG", "Java Programming");
        System.out.println(feel);

    }
}
