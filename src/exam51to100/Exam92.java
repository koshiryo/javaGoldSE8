package exam51to100;

import java.util.function.DoubleSupplier;

public class Exam92 {

	String name;
	Integer cost;

	Exam92(String name, Integer cost) {
		this.name = name;
		this.cost = cost;
	}

	String getName() {
		return name;
	}

	int getCost() {
		return cost;
	}

	public static void main(String[] args) {
		Exam92 j1 = new Exam92("IT", null);
		DoubleSupplier js1 = j1::getCost;
		System.out.println(j1.getName() + ":" + js1.getAsDouble());
	}

}
