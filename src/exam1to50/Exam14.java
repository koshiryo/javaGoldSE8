package exam1to50;

public class Exam14 {

	public static void main(String[] args) {
		try {
			doStuff();
		} catch (ArithmeticException | NumberFormatException e) { // line 26
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void doStuff() throws ArithmeticException, NumberFormatException, Exception {
		if (Math.random() > -1)
			throw new Exception("Try again");
	}

}