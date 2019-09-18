package exam51to100;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Exam77 {
    public static void main(String[] args) throws Exception {
        Path source = Paths.get("E://green.txt");
        Path target = Paths.get("E://colors/yellow.txt");
        Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
        Files.delete(source);
    }
}
