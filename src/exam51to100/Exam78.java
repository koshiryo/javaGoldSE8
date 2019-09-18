package exam51to100;

public class Exam78 {
	interface Doable {

		public void doSomething(String s);
	}

	public abstract class Task implements Doable {
		public void doSomethingElse(String s) {
		}
	}

	public class Do implements Doable {
		public void doSomething(Integer i) {
		}

		@Override
		public void doSomething(String s) {
		}

		public void doThat(String s) {
		}
	}

}
