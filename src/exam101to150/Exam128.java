package exam101to150;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Exam128 {

    public static void main(String[] args) {
        Map<Integer, Integer> mVa1 = new HashMap<>();
        mVa1.put(1, 10);
        mVa1.put(2, 20);
        //line n1
        BiConsumer<Integer,Integer> c = (i, j) -> {System.out.print (i + "," + j+";");};
        c.accept(1,2);
        mVa1.forEach(c);

    }
}
