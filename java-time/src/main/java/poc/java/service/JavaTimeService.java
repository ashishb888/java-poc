package poc.java.service;

import static poc.java.utils.DateTimeUtils.*;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class JavaTimeService {

	private void start() {
		log.debug("main service");

		long millis80 = 83403758866254L; // 2020-04-29 15:12:43.0
		int seconds80 = 1272618900; // 2020-04-29 09:15:00.0

		try {
			log.debug("timestamp from millis80: " + toTimestamp(toMillis(millis80)));
			log.debug("timestamp from millis80 toMillisPt: " + toTimestamp(toMillisPt(millis80)));
			log.debug("date from millis80: " + toDate(toMillis(millis80)));
			log.debug("date from seconds80: " + toDate(toMillis(seconds80)));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	public void main() {
		log.debug("main service");

		start();
	}
}
