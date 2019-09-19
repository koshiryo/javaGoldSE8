package exam101to150;

public class Exam131 {

	interface P {
		public void method1();
	}

	interface Q extends P {
		public void method1();
	}

	interface R extends P {
		public void method2();
	}

	interface S {
		public default void method() {

		}
	}

	interface T {
		public void method1();

		public void method2();
	}

	interface U {
		public void method1();

		public abstract void method2();
	}

	public void test() {
		P p = () -> {

		};
		Q q = () -> {

		};
		R r = new R() {

			@Override
			public void method1() {

			}

			@Override
			public void method2() {

			}
		};
		S s = new S() {
		};
		T t = new T() {

			@Override
			public void method1() {

			}

			@Override
			public void method2() {

			}
		};
		U u = new U() {

			@Override
			public void method1() {

			}

			@Override
			public void method2() {

			}
		};
	}

}
