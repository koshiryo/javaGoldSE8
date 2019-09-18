package exam51to100;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exam93 {

    public static void main(String[] args) {
        List<String> li = Arrays.asList("Java", "J2EE", "J2ME", "JSTL", "JSP", "Oracle DB");
        Predicate<String> val = p -> p.contains("J");
        List<String> neLi = li.stream().filter(x -> x.length() > 3)
                .filter(val).collect(Collectors.toList());
        System.out.println(neLi);
    }
}
