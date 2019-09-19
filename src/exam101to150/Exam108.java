package exam101to150;

import java.text.NumberFormat;
import java.util.Locale;

public class Exam108 {

    public static void main(String[] args) {
        double d = 15;
        Locale l = new Locale("en", "US");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(l);
        System.out.println(formatter.format(d));
    }
}
