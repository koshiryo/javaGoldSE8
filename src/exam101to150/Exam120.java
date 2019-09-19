package exam101to150;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exam120 {
    public static void main(String[] args) {

        try {
            Stream<String> stream = Files.lines(Paths.get("E://customers.txt"));
            stream.forEach(c -> System.out.println(c));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
