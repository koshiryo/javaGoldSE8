package exam1to50;

public class Exam08 {

	abstract class Shape {
		Shape() {
			System.out.println("Shape");
		}

		protected void area() {
			System.out.println("Shape");
		}
	}

	class Square extends Shape {
		int side;

		Square(int side) {
			/* insert code here */
			this.side = side;
		}

		public void area() {
			System.out.println("Square");
		}
	}

	class Rectangle extends Square {
		int len, br;

		Rectangle(int x, int y) {
			/* insert code here */ // line 17
			super(x);
			len = x;
			br = y;
		}

		public void area() { // line 20
			System.out.println("Rectangle");
		}
	}

}