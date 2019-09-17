package exam1to50;

public class Exam47 {

	public final class IceCream {
		public void prepare() {
		}
	}

	public class Cake {
		public void bake(int min, int temp) {
		}

		public void mix() {
		}
	}

	public class Shop {
		private Cake c = new Cake();
		private final double discount = 0.25;

		public void makeReady() {
			c.bake(10, 120);
		}
	}

	public class Bread extends Cake {
		public void bake(int minutes, int temperature) {
		}

		public void addToppings() {
		}
	}
}
