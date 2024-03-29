package exam51to100;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Exam82 {

    public static void main(String[] args) throws Exception {

        ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneId.of("UTC-7"));
        ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));
        long hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
        System.out.println("Travel time is " + hrs + " hours");
    }
}
