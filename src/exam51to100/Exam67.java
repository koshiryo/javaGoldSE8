package exam51to100;

import java.util.function.BiFunction;

public class Exam67 {
    public static void main(String[] args) throws Exception {
        //编译错误发生在第n1行。
        BiFunction<Integer, Double, Double> val = Double::sum; //line n1
        System.out.println(val.apply(10, 10.5));
    }
}
