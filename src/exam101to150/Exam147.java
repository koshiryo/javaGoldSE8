package exam101to150;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exam147 {

	static class ResourcesApp {
		public void loadResourceBundle() {
			ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);
//			System.out.println(resource.getObject(1));			// getObject(String key)
		}
	}

	public static void main(String[] args) {
		new ResourcesApp().loadResourceBundle();
	}

}