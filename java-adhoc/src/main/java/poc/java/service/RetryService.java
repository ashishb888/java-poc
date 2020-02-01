package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ashishb888
 */

@Service
@Slf4j
public class RetryService {

	private void start() {
		log.debug("start service");

		throw new RuntimeException("Intended exception");
	}

	private void init() {
		log.debug("init starts");

		final int maxRetries = 10;
		int retries = 0;

		while (retries <= maxRetries) {
			try {
				start();
				break;
			} catch (Exception e) {
				// log.error(e.getMessage(), e);
				log.error(e.getMessage());
				retries++;
			}
		}

		log.debug("retries: " + retries);
		log.debug("init ends");
	}

	public void main() {
		log.debug("main service");

		init();
	}
}
