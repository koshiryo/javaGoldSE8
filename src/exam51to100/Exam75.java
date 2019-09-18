package exam51to100;

import java.util.Arrays;

public class Exam75 {
    static class CheckClass {
        public static int checkValue(String s1, String s2) {
            return s1.length() - s2.length();
        }
    }

    public static void main(String[] args) {

        String[] strArray = new String[]{"Tiger", "Rat", "Cat", "Lion"};
        //line n1
        Arrays.sort(strArray, CheckClass::checkValue);
        for (String s : strArray) {
            System.out.print(s + " ");
        }
    }

}
