package exam1to50;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Exam31 {

	public static void main(String[] args) throws IOException {
		// Stream<Path> files =
		// Files.walk(Paths.get(System.getProperty("user.home")));
		Stream<Path> files = Files.walk(Paths.get("E://test"));
		files.forEach(fName -> { // line n1
			try {
				Path aPath = fName.toAbsolutePath(); // line n2
				System.out.println(fName + ":" + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		});
	}

}
