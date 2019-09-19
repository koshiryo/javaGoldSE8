package exam101to150;

import java.util.function.Predicate;

public class Exam110 {
	public interface LengthValidator {
		public boolean checkLength(String str);
	}

	public static void main(String[] args) {
		boolean res = new LengthValidator() {
			@Override
			public boolean checkLength(String str) {
				return str.length() > 5 && str.length() < 10;
			}
		}.checkLength("Hello");

		Predicate<String> square = t -> t.length() > 5 && t.length() < 10;
		boolean res2 = square.test("Hello");

		System.out.println(res);
		System.out.println(res2);
	}

}
