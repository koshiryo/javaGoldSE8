package exam1to50;

public class Exam43 {

	interface Rideable {
		Car getCar(String name);
	}

	static class Car {
		private String name;

		public Car(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {
		Rideable rider = Car::new;
		Car vehicle = rider.getCar("MyCar");
		
		Rideable rider2 = new Rideable() {
		    @Override
		    public Car getCar(String name) {
		        return new Car(name);
		    }
		};
	}

}
