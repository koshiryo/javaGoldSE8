package exam1to50;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exam41 {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
		Predicate<String> test = s -> {
			int i = 0;
			boolean result = s.contains("pen");
			System.out.print((i++) + ":");
			return result;
		};
		str.stream().filter(test).findFirst().ifPresent(System.out::print);
	}

}
