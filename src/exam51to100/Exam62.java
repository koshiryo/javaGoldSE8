package exam51to100;

import java.util.Locale;

public class Exam62 {
    public static void main(String[] args) throws Exception {
//上面三个报错，所以是最后两个正确
//        Locale loc1 = "UK";
//        Locale loc2 = Locale.getInstance("ru");
//        Locale loc3 = Locale.getLocaleFactory("RU");
        Locale loc4 = Locale.UK;
        Locale loc5 = new Locale("ru", "RU");
    }
}
