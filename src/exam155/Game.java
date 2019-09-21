package exam155;

import java.io.IOException;

public class Game extends Video {
	public void play() throws IOException {
		super.play();
		System.out.print("Video played.");
	}
}