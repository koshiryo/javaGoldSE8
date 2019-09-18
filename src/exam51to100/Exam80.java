package exam51to100;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exam80 {
    public static void main(String[] args) throws Exception {

        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader(new FileReader("E://employee.txt"))) { //line n1
            br.lines().forEach(c -> System.out.println(c));
            brCopy = br; //line n2
        }
        brCopy.ready(); //line n3;

    }
}
