package exam51to100;

import java.util.Arrays;
import java.util.List;

public class Exam87 {

	static class Product {
		String name;
		int qty;

		@Override
		public String toString() {
			return name;
		}

		public Product(String name, int qty) {
	        this.name = name;
	        this.qty = qty;
	    }

		static class ProductFilter {
			public static boolean isAvailable(Product p) {// line n1
				return p.qty >= 10;
			}

		}
	}

	public static void main(String[] args) throws Exception {
		List<Product> products = Arrays.asList(new Product("MotherBoard", 5), new Product("Speaker", 20));
		products.stream().filter(Product.ProductFilter::isAvailable)// line n2
				.forEach(p -> System.out.println(p));

	}

}
