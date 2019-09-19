package exam101to150;

public class Exam141 {

	interface Interface1 {
		public default void sayHi() {
			System.out.println("Hi Interface-1");
		}
	}

	interface Interface2 {
		public default void sayHi() {
			System.out.println("Hi Interface-2");
		}
	}

	static class MyClass implements Interface1, Interface2 {
		public void sayHi() {
			System.out.println("Hi MyClass");
		}
	}

	public static void main(String[] args) {
		Interface1 obj = new MyClass();
		obj.sayHi();
	}

}