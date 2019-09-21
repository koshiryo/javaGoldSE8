package exam151to166;

import java.util.stream.IntStream;

public class Exam153 {

	public static void main(String[] args) {
		IntStream str = IntStream.of(1, 2, 3, 4);
		Double d = str.average().getAsDouble();
		System.out.println("Average = " + d);
	}

}