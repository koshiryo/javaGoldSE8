package exam1to50;

public class Exam27 {

	public static enum USCurrency {
		PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
		private int value;

		private USCurrency(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public static void main(String[] args) throws Exception {
		USCurrency usCoin = USCurrency.DIME;
		System.out.println(usCoin.getValue());
	}

}
