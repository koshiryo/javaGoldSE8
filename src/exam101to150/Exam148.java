package exam101to150;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Exam148 {

	public static class Test {
		List<String> list = null;

		public void printValues() {
			System.out.println(getList());
		}

		public List<String> getList() {
			return list;
		}


		public void setList(List<String> newList) {
			this.list = newList;
		}

	}

	public static void main(String[] args) {
		List<String> li = Arrays.asList("Dog", "Cat", "Mouse");
		Test t = new Test();
		t.setList(li.stream().collect(Collectors.toList()));
		t.getList().forEach(System.out::print);
	}

}