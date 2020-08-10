package poc.java.utils;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DateTimeUtils {

	public final static long DIFF_70_TO_80_MS = 315513000000L;
	public final static long DIFF_70_TO_80_SEC = 315532800L;
	public final static int SEC_TO_MS = 1000;
	public final static int JIFFI_FACTOR = 65536;
	public final static int S_TO_MS = 1000;

	static DateTimeFormatter timestampFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static String ofPattern(long millis) throws Exception {
		return ofPatternTimestamp(toLocalDate(millis));
	}

	public static LocalDateTime toLocalDate(long millis) {
		return LocalDateTime.ofEpochSecond(millis / JIFFI_FACTOR, 0, ZoneOffset.UTC).plusSeconds(DIFF_70_TO_80_SEC);
	}

	public static String ofPattern(int seconds) throws Exception {
		return ofPatternDate(toLocalDate(seconds));
	}

	public static LocalDateTime toLocalDate(int seconds) {
		return LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.UTC).plusSeconds(DIFF_70_TO_80_SEC);
	}

	public static String ofPatternTimestamp(LocalDateTime localDateTime) throws Exception {
		try {
			return localDateTime.format(timestampFormatter);
		} catch (Exception e) {
			throw e;
		}
	}

	public static String ofPatternDate(LocalDateTime localDateTime) throws Exception {
		try {
			return localDateTime.format(dateFormatter);
		} catch (Exception e) {
			throw e;
		}
	}

	public static LocalDateTime parseTimstamp(String dateString) {
		try {
			return LocalDateTime.parse(dateString, timestampFormatter);
		} catch (Exception e) {
			throw e;
		}
	}

	public static LocalDateTime parseDate(String dateString) {
		try {
			return LocalDateTime.parse(dateString, timestampFormatter);
		} catch (Exception e) {
			throw e;
		}
	}

	/*****************************/

//	static {
//		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
//	}

	public static long toMillis(long millis) throws Exception {
		// return ((millis / JIFFI_FACTOR) + DIFF_70_TO_80_SEC) * S_TO_MS;

		try {
			return parseTimstamp(ofPattern(millis)).toEpochSecond(ZoneOffset.of("+05:30")) * 1000;
		} catch (Exception e) {
			throw e;
		}
	}

	public static long toMillisPt(long millis) throws Exception {
		return ((millis / JIFFI_FACTOR) + DIFF_70_TO_80_SEC) * S_TO_MS;
	}

	public static long toMillis(int seconds) {
		return (seconds + DIFF_70_TO_80_SEC) * S_TO_MS;
	}

	public static Timestamp toTimestamp(long millis) {
		return new Timestamp(millis);
	}

	public static java.sql.Date toDate(long millis) {
		return new java.sql.Date(millis);
	}

}
