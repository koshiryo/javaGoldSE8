package exam1to50;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exam20 {

	public static void main(String[] args) throws Exception {
		Path p1 = Paths.get("E://Pics/MyPic.jpeg");
		System.out.println(p1.getNameCount() + ":" + p1.getName(1) + ":" + p1.getFileName());
	}

}
