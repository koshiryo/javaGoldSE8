package exam101to150;

import java.util.Arrays;
import java.util.List;

public class Exam129 {
    public static void main(String[] args) {
        List<String> nums = Arrays.asList("EE", "SE","AA","BB");
        String ans = nums.parallelStream()
                .reduce("Java ", (a, b) -> a.concat(b));
        System.out.println(ans);
    }
}
