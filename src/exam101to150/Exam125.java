package exam101to150;

import java.util.Arrays;
import java.util.List;

public class Exam125 {

    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(3, 4, 5);
        prices.stream()
                .filter(e -> e > 4)
                .peek(e -> System.out.print("Price " + e))
                .map(n -> n - 1)
                .forEach(n -> System.out.print(" New Price " + n));
    }

}
