package exam51to100;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Exam88 {

    public static void main(String[] args) throws Exception {
        Locale currentLocale = new Locale.Builder().setRegion("FR").setLanguage("fr").build();
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        Enumeration<String> names = messages.getKeys();
        while (names.hasMoreElements()) {
            String key = names.nextElement();
            String name = messages.getString(key);
            System.out.println(key + "=" + name);
        }
    }

}
