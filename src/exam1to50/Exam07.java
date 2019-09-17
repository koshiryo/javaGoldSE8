package exam1to50;

import java.util.function.Supplier;

public class Exam07 {

	static class Bird {
		public void fly() {
			System.out.print("Can fly");
		}
	}

	static class Penguin extends Bird {
		public void fly() {
			System.out.print("Cannot fly");
		}
	}

	public static void main(String[] args) {
		fly(() -> new Bird());
		fly(Penguin::new);
	}

	static void fly(Supplier<Bird> bird) {
		bird.get().fly();
	}
}