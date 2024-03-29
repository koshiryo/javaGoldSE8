package exam1to50;

public class Exam34 {

	static class Test<T> {
		private T t;

		public T get() {
			return t;
		}

		public void set(T t) {
			this.t = t;
		}
	}

	public static void main(String[] args) {
		Test<String> type = new Test<>();
		Test type1 = new Test(); // line n1
		type.set("Java");
		type1.set(100); // line n2
		System.out.print(type.get() + " " + type1.get());
	}

}
