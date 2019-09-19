package exam101to150;

import java.util.Arrays;
import java.util.List;

public class Exam145 {

	static class Person {
		private String firstName;
		private int salary;

		public Person(String fN, int sal) {
			super();
			this.firstName = fN;
			this.salary = sal;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

	}

	public static void main(String[] args) {
		List<Person> prog = Arrays.asList(new Person("Smith", 1500), new Person("John", 2000), new Person("Joe", 1000));
		double dVal = prog.parallelStream().filter(s->s.getFirstName().startsWith("J"))
				.mapToInt(Person::getSalary)
				.average()
				.getAsDouble();
		System.out.println(dVal);
	}

}