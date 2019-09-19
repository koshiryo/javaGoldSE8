package exam101to150;

import java.util.function.UnaryOperator;

public class Exam101 {

    public static void main(String[] args) {
        final String str1 = "Java";
        StringBuffer strBuf = new StringBuffer("Course");
        UnaryOperator<String> u = (str2) -> str1.concat(str2);//line n1
        UnaryOperator<String> c = (str3) -> str3.toLowerCase();
        System.out.println(u.apply(c.apply(strBuf.toString())));//line n2
    }
}
