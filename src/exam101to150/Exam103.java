package exam101to150;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Exam103 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(10, 20, 30);
        Function<Integer, Integer> fn = f1 -> f1 + f1;
        Consumer<Integer> conCal = s -> System.out.print("Val:" + s + " ");
        li.stream().map(fn).forEach(conCal);
    }
}
