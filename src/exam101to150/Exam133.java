package exam101to150;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exam133 {
	public static void main(String[] args) {
		// line n1
		try {
			Stream<Path> stream = Files.list(Paths.get("E://company"));
//			Stream<Path> stream = Files.find(Paths.get("E://company"), 1, (p, b) -> b.isDirectory(),
//					FileVisitOption.FOLLOW_LINKS);
			stream.forEach(s -> System.out.println(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}