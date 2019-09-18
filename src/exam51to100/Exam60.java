package exam51to100;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exam60 {
    public static void main(String[] args) throws Exception {

        List<String> nL = Arrays.asList("Jim", "John", "Jeff");
        Function<String, String> funVal = s -> "Hello : ".concat(s);
        nL.stream()
                .map(funVal)
                .forEach(System.out::print);
    }

}
