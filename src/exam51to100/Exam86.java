package exam51to100;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exam86 {

    public static void main(String[] args) throws Exception {
        Path path1 = Paths.get("/software/././sys/readme.txt");
        Path path2 = path1.normalize();
        System.out.println(path2);
        Path path3 = path2.relativize(path1);
        System.out.println(path3);
        System.out.print(path1.getNameCount());
        System.out.print(" : "+path2.getNameCount());
        System.out.print(" : "+path3.getNameCount());
    }
}
