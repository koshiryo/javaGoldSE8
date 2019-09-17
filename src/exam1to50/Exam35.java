package exam1to50;

public class Exam35 {

	static class Vehicle {
		private String name;

		void setName(String name) {
			this.name = name;
		}

		String getName() {
			return name;
		}
	}

	public static void main(String[] args) {
		Vehicle ve = new Vehicle();
		ve.name = "";
	}

}
