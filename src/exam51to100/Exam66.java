package exam51to100;

import java.time.LocalDate;
import java.time.Month;

public class Exam66 {

    public static void main(String[] args) throws Exception {
        LocalDate valentinesDay =LocalDate.of(2015, Month.FEBRUARY, 14);
        LocalDate nextYear = valentinesDay.plusYears(1);
        LocalDate nextYear2 = nextYear.plusDays(15); //line n1
        System.out.println(nextYear);
        System.out.println(nextYear2);
    }
}
