package exam151to166;

import java.io.IOException;

public class Exam155 {

	static class Video {
		public void play() throws IOException {
			System.out.print("Video played.");
		}
	}

	static class Game extends Video {
		public void play() throws IOException {
			super.play();
			System.out.print("Game played.");
		}
	}

	public static void main(String[] args) {
		try {
			new Game().play();
		} catch (Exception e) {
			System.out.print(e.getClass());
		}
	}

}