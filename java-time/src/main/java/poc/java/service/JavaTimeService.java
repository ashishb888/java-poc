package poc.java.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.TimeZone;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class JavaTimeService {

	public final static long DIFF_70_TO_80_MS = 315513000000L;
	public final static long DIFF_70_TO_80_SEC = 315532800L;
	public final static int SEC_TO_MS = 1000;
	public final static int JIFFI_FACTOR = 65536;
	public final static int S_TO_MS = 1000;

	static {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	private long toMillis(long millis) {
		return ((millis / JIFFI_FACTOR) + DIFF_70_TO_80_SEC) * S_TO_MS;
	}

	private long toMillis(int seconds) {
		return (seconds + DIFF_70_TO_80_SEC) * S_TO_MS;
	}

	private Timestamp toTimestamp(long millis) {
		return new Timestamp(millis);
	}

	private java.sql.Date toDate(long millis) {
		return new java.sql.Date(millis);
	}

	public static LocalDateTime toLocalDate(long jiffies) {
		return LocalDateTime.ofEpochSecond(jiffies / JIFFI_FACTOR, 0, ZoneOffset.UTC).plusSeconds(DIFF_70_TO_80_SEC);
	}

	public static LocalDateTime toLocalDate(int seconds) {
		return LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.UTC).plusSeconds(DIFF_70_TO_80_SEC);
	}

	private void start() {
		log.debug("main service");

		long millis80 = 83403758866254L; // 2020-04-29 15:12:43.0
		int seconds80 = 1272618900; // 2020-04-29 09:15:00.0

		log.debug("timestamp from millis80: " + toTimestamp(toMillis(millis80)));
		log.debug("date from millis80: " + toDate(toMillis(millis80)));
		log.debug("date from seconds80: " + toDate(toMillis(seconds80)));
	}

	public void main() {
		log.debug("main service");

		start();
	}
}
