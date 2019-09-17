package exam1to50;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exam50 {

	public static void main(String[] args) {
		Stream<Path> paths = Stream.of(Paths.get("E://data.doc"), Paths.get("E://data.txt"), Paths.get("E://data.xml"));
		paths.filter(s -> s.toString().endsWith("txt")).forEach(s -> {
			try {
				Files.readAllLines(s).stream().forEach(System.out::println); // line n1
			} catch (IOException e) {
				System.out.println("Exception");
			}
		});
	}

}
