package exam1to50;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Exam12 {

	public static void main(String[] args) throws IOException {
		Path file = Paths.get("E:\\courses.txt");
		// line n1
		Stream<String> fc = Files.lines(file);
		fc.forEach(System.out::println);
		
		List<String> fc2 = Files.readAllLines(file);
		fc2.forEach(System.out::println);
		
	}

}