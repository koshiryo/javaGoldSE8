package exam151to166;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam160 {
	
	static class Employee{
		String dept,name;
		public Employee(String d,String n){
			dept = d;
			name = n;
		}
		public String toString() {
			return getDept()+":"+getName();
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("sales", "Ada"),
				new Employee("sales", "Bob"),
				new Employee("hr", "Bob"),
				new Employee("hr", "Eva"));
		Stream<Employee> s = emps.stream()
				.sorted(Comparator.comparing((Employee e)->e.getDept())
						.thenComparing((Employee e)->e.getName()));
		List<Employee> eSorted = s.collect(Collectors.toList());
		System.out.println(eSorted);
	}

}