package poc.java.service;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
public class CountDownLatchService {
	private static Logger logger = LoggerFactory.getLogger(CountDownLatchService.class);

	@AllArgsConstructor
	static class AppService implements Runnable {

		private final String name;
		private final long millis;
		private final CountDownLatch latch;

		@Override
		public void run() {
			try {
				Thread.sleep(millis);
			} catch (Exception e) {
				logger.error("", e);
			}

			logger.info("Service " + name + " has been started");

			latch.countDown();
		}

	}

	public void main() {
		logger.info(this.getClass().getName() + ": main service starts");

		final CountDownLatch latch = new CountDownLatch(3);

		new Thread(new AppService("serviceA", 1000, latch)).start();
		new Thread(new AppService("serviceB", 500, latch)).start();
		new Thread(new AppService("serviceC", 1500, latch)).start();

		try {
			latch.await();
		} catch (InterruptedException e) {
			logger.error("", e);
		}

		logger.info(this.getClass().getName() + ": main service ends");
	}
}
