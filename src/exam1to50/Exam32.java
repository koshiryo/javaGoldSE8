package exam1to50;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Exam32 {

	static class Vehicle implements Comparable {
		int vno;
		String name;

		public Vehicle(int vno, String name) {
			this.vno = vno;
			this.name = name;
		}

		public String toString() {
			return vno + ":" + name;
		}

		@Override
		public int compareTo(Object arg0) {
			int result = 0;
			if (this.vno > ((Vehicle) arg0).vno) {
				result = 1;
			} else {
				result = -1;
			}
			return result;
		}
	}

	public static void main(String[] args) {
		// TreeSet实现了SortedSet接口，可以对集合中的对象进行排序，在使用TreeSet时必须要给TreeSet传递一个比较器，也就是指定比较规则，否则的话，它就不知道谁大谁小，也就不能排序了。此时它会报一个ClassCastException的异常
		MyComparator comparator = new MyComparator();
		Set<Vehicle> vehicles = new TreeSet<>();
		// Set<Vehicle> vehicles = new TreeSet<>(comparator);
		vehicles.add(new Vehicle(10123, "Ford"));
		vehicles.add(new Vehicle(10124, "BMW"));
		System.out.println(vehicles);
	}

	static class MyComparator implements Comparator<Vehicle> {

		@Override
		public int compare(Vehicle o1, Vehicle o2) {
			int result = 0;
			if (o1.vno > o2.vno) {
				result = 1;
			} else {
				result = -1;
			}
			return result;
		}
	}
}
