package exam1to50;

import java.util.Optional;

public class Exam30 {

	static class Employee {
		Optional<Address> address;

		Employee(Optional<Address> address) {
			this.address = address;
		}

		public Optional<Address> getAddress() {
			return address;
		}
	}

	static class Address {
		String city = "New York";

		public String getCity() {
			return city;
		}

		public String toString() {
			return city;
		}
	}

	public static void main(String[] args) {
		Address address = null;
		Optional<Address> addrs1 = Optional.ofNullable(address);
		System.out.println(addrs1.isPresent());
		Employee e1 = new Employee(addrs1);
		String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
		System.out.println(eAddress);
	}

}
