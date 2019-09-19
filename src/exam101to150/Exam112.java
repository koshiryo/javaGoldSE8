package exam101to150;

import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

public class Exam112 {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        now = LocalTime.of(6, 30);
        long timeToBreakfast = 0;
        LocalTime office_start = LocalTime.of(7, 30);
        if (office_start.isAfter(now)) {
            timeToBreakfast = now.until(office_start, MINUTES);
        } else {
            timeToBreakfast = now.until(office_start, HOURS);
        }
        System.out.println(timeToBreakfast);
    }

}
