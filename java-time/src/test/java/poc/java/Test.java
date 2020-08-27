package poc.java;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Test {

	static DateTimeFormatter timestampFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {
		// TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		LocalDateTime ldt = LocalDateTime.parse("2020-08-13 15:59:24", timestampFormatter);
		System.out.println("ldt: " + ldt);
		// long epoch = ldt.toEpochSecond(ZoneOffset.of("+05:30")) * 1000;
		 long epoch = ldt.toEpochSecond(ZoneOffset.UTC) * 1000;
		System.out.println("epoch: " + epoch);

		Timestamp t = new Timestamp(epoch);

		System.out.println("t: " + t.getTime());
	}

}

// 1597314564000
// 1597334364000