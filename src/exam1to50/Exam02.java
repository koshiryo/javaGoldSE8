package exam1to50;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Exam02 {
	public static void main(String[] args) {
		IntStream stream = IntStream.of(1, 2, 3);
		IntFunction<IntUnaryOperator> inFu = x -> y -> x * y; // line n1
		IntStream newStream = stream.map(inFu.apply(10)); // line n2
		newStream.forEach(System.out::print);
	}
}