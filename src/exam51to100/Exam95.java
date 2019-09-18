package exam51to100;

public class Exam95 {

	static class DaTaConverter implements AutoCloseable {

		public void copyFlatFilesToTables() {

		}

		public void close() throws Exception {
			throw new RuntimeException();// line n1
		}

	}

	public static void main(String[] args) throws Exception  {
		try (DaTaConverter dc = new DaTaConverter()) {// line n2
			dc.copyFlatFilesToTables();
		}
	}
}
