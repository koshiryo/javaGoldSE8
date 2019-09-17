package exam1to50;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exam26 {

	static class Emp {
		String fName;
		String lName;

		public Emp(String fn, String ln) {
			fName = fn;
			lName = ln;
		}

		public String getfName() {
			return fName;
		}

		public String getlName() {
			return lName;
		}
	}

	public static void main(String[] args) throws Exception {
		List<Emp> emp = Arrays.asList(new Emp("John", "Smith"), new Emp("Peter", "Sam"), new Emp("Thomas", "Wale"));
		List<Emp> emp2 = emp.stream()
				// line n1
				.sorted(Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName)).collect(Collectors.toList());
		for (int i = 0; i < emp2.size(); i++) {
			System.out.println(emp2.get(i).getfName() + "-" + emp2.get(i).getlName());
		}
	}

}
