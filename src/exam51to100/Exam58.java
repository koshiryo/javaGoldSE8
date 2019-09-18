package exam51to100;

import java.util.function.ToIntFunction;

public class Exam58 {
    public static void main(String[] args) throws Exception {

        String str = "Java is a programming language";
        ToIntFunction<String> indexVal = str::indexOf; 	//line n1
        int x = indexVal.applyAsInt("Java"); 			//line n2
        System.out.println(x);

    }
}
