package exam1to50;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exam15 {

	public static void main(String[] args) {
		List<Country> couList = Arrays.asList(
				new Country("Germany", Country.Continent.EUROPE),
				new Country("Italy", Country.Continent.EUROPE),
				new Country("Japan", Country.Continent.ASIA));
		Map<Country.Continent, List<String>> regionNames = couList.stream().collect(
				Collectors.groupingBy(Country::getRegion, Collectors.mapping(Country::getName, Collectors.toList())));
		System.out.println(regionNames);
	}

	public static class Country {
		public enum Continent {
			ASIA, EUROPE
		}

		String name;
		Continent region;

		public Country(String na, Continent reg) {
			name = na;
			region = reg;
		}

		public String getName() {
			return name;
		}

		public Continent getRegion() {
			return region;
		}
	}

}