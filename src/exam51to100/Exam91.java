package exam51to100;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Exam91 {


    public static void main(String[] args) {
        try {
            List<String> content = Files.readAllLines(Paths.get("E://employee.txt"));
            content.stream().forEach(line -> {
                        try {
                            Files.write(
                                    Paths.get("E://allemp.txt"),
                                    line.getBytes(),
                                    StandardOpenOption.APPEND
                            );
                        } catch (IOException e) {
                        	e.printStackTrace();
                            System.out.println("Exception 1");
                        }
                    }
            );
        } catch (IOException e) {
            System.out.println("Exception 2");
        }
    }
}
