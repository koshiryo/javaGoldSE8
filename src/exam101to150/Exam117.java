package exam101to150;

import java.util.Arrays;
import java.util.List;

public class Exam117 {

    public static void main(String[] args) {
        List<String> valList = Arrays.asList("", "George", "", "John", "Jim");
        Long newVal = valList.stream()         //line n1
                .filter(x -> !x.isEmpty())
                .count();                      //line n2
        System.out.println(newVal);

    }
}
