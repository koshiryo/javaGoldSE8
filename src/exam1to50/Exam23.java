package exam1to50;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exam23 {

	public static void main(String[] args) throws Exception {
		Path source = Paths.get("E://data/december/log.txt");
		Path destination = Paths.get("E://data");
		Files.copy(source, destination);
	}

}
