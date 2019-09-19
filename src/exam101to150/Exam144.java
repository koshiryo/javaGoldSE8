package exam101to150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam144 {

	static class Person implements Comparable<Person>{
		String name;

		public Person(String name) {
			this.name = name;
		}

		@Override
		public int compareTo(Person p) {
			return this.name.compareTo(p.name);
		}

	}

	public static void main(String[] args) {
		List<Person> emps = new ArrayList<>();
		/*
		 * code that adds objects of the Person class to the emps list goes here
		 */
		Collections.sort(emps);
	}

}