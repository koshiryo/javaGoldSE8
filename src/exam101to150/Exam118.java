package exam101to150;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Exam118 {
	public static void main(String[] args) {
		// Long time:2015-01-12T21:58:18.817z
		Instant loginTime = Instant.now();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Long time:2015-01-12T21:58:19.880z
		Instant logoutTime = Instant.now();
		loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);// line n1
		logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);
		
		System.out.println(loginTime);
		System.out.println(logoutTime);
		
		if (logoutTime.isAfter(loginTime)) {
			System.out.println("Logged out at:" + logoutTime);
		} else {
			System.out.println("Can't logout");
		}
	}

}
