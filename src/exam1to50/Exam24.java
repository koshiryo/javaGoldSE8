package exam1to50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam24 {

	static class Student {
		String course, name, city;

		public Student(String name, String course, String city) {
			this.course = course;
			this.name = name;
			this.city = city;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String toString() {
			return course + ":" + name + ":" + city;
		}
	}

	public static void main(String[] args) throws Exception {
		List<Student> stds = Arrays.asList(new Student("Jessy", "Java ME", "Chicago"),
				new Student("Helen", "Java EE", "Houston"), new Student("Mark", "Java ME", "Chicago"));

		stds.stream().collect(Collectors.groupingBy(Student::getCourse)).forEach((src, res) -> System.out.println(src));
	}

}
