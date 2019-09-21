package exam155;

public class Exam155 {
	
	public static void main(String[] args) {
		try {
			new Game().play();
		} catch (Exception e) {
			System.out.print(e.getClass());
		}
	}

}