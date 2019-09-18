package exam51to100;

import java.util.Arrays;
import java.util.List;

public class Exam100 {

    public static void main(String[] args) {
        List<String> cs = Arrays.asList("Java", " Java EE", "Java ME");
        //line n1
        boolean a = cs.stream().findAny().get().equals("Java");
        boolean b = cs.stream().anyMatch(w -> w.equals("Java"));
        boolean c = cs.stream().findFirst().get().equals("Java");
        boolean d = cs.stream().allMatch(w -> w.equals("Java"));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
