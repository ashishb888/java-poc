package poc.java.service;

import java.nio.ByteBuffer;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ByteBufferService {

	private void start() {
		ByteBuffer bb1 = ByteBuffer.allocate(40);
		long l = System.currentTimeMillis();
		Date d = new Date(l);
		Timestamp t = new Timestamp(l);

		bb1.position(0);// Setting position manually
		bb1.put("Hello".getBytes()); // Putting strings
		bb1.position(10);
		bb1.put("There".getBytes());
		bb1.putInt(20, 10);
		bb1.putLong(24, d.getTime()); // Putting dates
		bb1.putLong(32, t.getTime()); // Putting timestamps

		// bb1.flip();

//		log.debug("Position 0: " + getStringFromByteBuffer(bb1, 0, 10)); // Getting strings
//		log.debug("Position 10: " + getStringFromByteBuffer(bb1, 10, 10));
//		log.debug("Position 20: " + bb1.getInt(20));
//		log.debug("Position 24: " + toDate(bb1.getLong(24))); // Formatting date to a custom format
//		log.debug("Position 32: " + toTimestamp(bb1.getLong(32))); // Formatting timestamp to a custom format

		long millis = System.currentTimeMillis();
		ByteBuffer bb2 = ByteBuffer.allocate(bb1.limit() + 26);
		// bb2.position(0);
		bb2.put(bb1.array());
		bb2.position(40);
		bb2.put("Second BB".getBytes());
		bb2.putLong(50, new Timestamp(millis).getTime());
		bb2.putLong(58, new Date(millis).getTime());

		log.debug("Position 0: " + getStringFromByteBuffer(bb2, 0, 10)); // Getting strings
		log.debug("Position 10: " + getStringFromByteBuffer(bb2, 10, 10));
		log.debug("Position 20: " + bb2.getInt(20));
		log.debug("Position 24: " + toDate(bb2.getLong(24))); // Formatting date to a custom format
		log.debug("Position 32: " + toTimestamp(bb2.getLong(32))); // Formatting timestamp to a custom format
		log.debug("Position 40: " + getStringFromByteBuffer(bb2, 40, 10));
		log.debug("Position 50: " + toTimestamp(bb2.getLong(50))); // Formatting timestamp to a custom format
		log.debug("Position 58: " + toDate(bb2.getLong(58))); // Formatting date to a custom format
	}

	static DateTimeFormatter timestampFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	private static Timestamp toTimestamp(long l) {
		if (l <= 0)
			return null;

		return new Timestamp(l);
		// return Timestamp.valueOf(
		// timestampFormatter.format(LocalDateTime.ofInstant(Instant.ofEpochMilli(l),
		// ZoneId.systemDefault())));
	}

	private static Date toDate(long l) {
		if (l <= 0)
			return null;

		return new Date(l);

		// return
		// Date.valueOf(dateFormatter.format(Instant.ofEpochMilli(l).atZone(ZoneId.systemDefault()).toLocalDate()));
	}

	private static String getStringFromByteBuffer(ByteBuffer byteBuffer, int offset, int length) {
		if (byteBuffer.get(offset) == 0)
			return null;

		byte[] bArr = new byte[length];
		byteBuffer.position(offset);
		byteBuffer.get(bArr, 0, length);

		return new String(bArr).trim();
	}

	public void main() {
		log.debug("main service");

		start();
	}
}
