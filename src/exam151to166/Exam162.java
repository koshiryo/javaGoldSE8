package exam151to166;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exam162 {

    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(100.12, 200.32);
//	DoubleFunction funD = d -> d + 100.0;l
        Consumer<Double> funD = d -> d += 100.0;
        doubles.stream().forEach(funD);                                      // line n1
        doubles.stream().forEach(e -> System.out.println(e));                // line n2
    }

}