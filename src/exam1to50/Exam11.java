package exam1to50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exam11 {

	public static void main(String[] args) {
		Stream<List<String>> iStr = Stream.of(Arrays.asList("1", "John"), Arrays.asList("2", null));
//		 Stream<String> nInSt = iStr.flatMapToInt((x) -> x.stream()); // 错误的写法
		Stream<String> nInSt = iStr.flatMap((x) -> x.stream()); // 正确的写法
		nInSt.forEach(System.out::print);
	}

}