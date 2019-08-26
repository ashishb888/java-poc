package poc.java.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
public class CyclicBarrierService {
	private static Logger logger = LoggerFactory.getLogger(CyclicBarrierService.class);

	@AllArgsConstructor
	static class AppService implements Runnable {

		private final String name;
		private final long millis;
		private final CyclicBarrier barrier;

		@Override
		public void run() {
			try {
				Thread.sleep(millis);
			} catch (Exception e) {
				logger.error("", e);
			}

			logger.info("Service " + name + " is preparing to start");

			try {
				barrier.await();
			} catch (InterruptedException e) {
				logger.error("", e);
			} catch (BrokenBarrierException e) {
				logger.error("", e);
			}

			logger.info("Service " + name + " has been started");
		}

	}

	public void main() {
		logger.info(this.getClass().getName() + ": main service starts");

		final CyclicBarrier barrier = new CyclicBarrier(3, () -> {
			logger.info("All services crossed barrier");
		});

		new Thread(new AppService("serviceA", 1000, barrier), "serviceA").start();
		new Thread(new AppService("serviceB", 500, barrier), "serviceB").start();
		new Thread(new AppService("serviceC", 1500, barrier), "serviceC").start();

		logger.info(this.getClass().getName() + ": main service ends");
	}
}
