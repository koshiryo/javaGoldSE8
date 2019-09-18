package exam51to100;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Exam54 {

    public static void main(String[] args) throws Exception {
        List<Integer> codes = Arrays.asList(10, 20);
        UnaryOperator<Double> uo = s -> s + 10.0;
//        codes.replaceAll(uo);//类型不对，发生编译错误。
        codes.forEach(c -> System.out.println(c));


    }
}
