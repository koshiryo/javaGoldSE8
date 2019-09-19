package exam101to150;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exam139 {

	public static void main(String[] args) {
		Locale currentLocale;
		// line n1
//		currentLocale = new Locale("de", "DE");
		
//		currentLocale = new Locale.Builder().setLanguage("de").setRegion("DE").build();
		
		currentLocale = Locale.GERMAN;
		
//		 currentLocale = new Locale();
//		 currentLocale.setLanguage ("de");
//		 currentLocale.setRegion ("DE");
		
//		currentLocale = Locale.getInstance(Locale.GERMAN,Locale.GERMANY);
		
		ResourceBundle messagea = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		System.out.println(messagea.getString("inquiry"));

	}

}
