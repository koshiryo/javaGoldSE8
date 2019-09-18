package exam51to100;

public class Exam98 {

	enum Course {
		JAVA(100), J2ME(150);
		private int cost;

		private Course(int c) {
			this.cost = c;
		}

		int getCost() {
			return cost;
		}
	}

	public static void main(String[] args) {
		for (Course a : Course.values()) {
			System.out.print(a + " Fees " + a.getCost() + " ");
		}
	}
}
