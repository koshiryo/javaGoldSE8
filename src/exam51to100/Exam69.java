package exam51to100;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Exam69 {
    public static void main(String[] args) throws Exception {

        UnaryOperator<Integer> uo1 = s -> s*2; //line n1
        List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
        loanValues.stream()
                .filter(lv -> lv >= 1500)
//                .map(lv -> uo1.apply(lv)) //line n2   //编译错误发生在第n2行。
                .forEach(s -> System.out.print(s + ""));


    }
}
