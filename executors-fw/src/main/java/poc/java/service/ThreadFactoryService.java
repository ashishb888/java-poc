package poc.java.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import poc.java.domain.ThreadFactoryImpl;

/**
 * @author ashishb888
 */

@Service
@Slf4j
public class ThreadFactoryService {

	private void start() {
		log.debug("start service");

		try {
			ExecutorService es = Executors.newFixedThreadPool(5,
					new ThreadFactoryImpl(10, new ThreadGroup("ks"), "kafka-consumer", new AtomicInteger(1)));

			for (int i = 0; i < 5; i++) {
				int li = i;
				es.execute(() -> {
					log.debug("execute: " + li);

					if (li == 2) {
						// This exception was not logged. But now we have used execute instead of submit
						// & attached UncaughtExceptionHandlerImpl to catch uncaught exceptions. So this
						// exception will be caught by UncaughtExceptionHandlerImpl
						int k = 5 / 0;
					}

					while (true) {
						log.debug("KS TEST");
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

				});
			}

			es.shutdown();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

		try {
			ExecutorService es = Executors.newFixedThreadPool(5,
					new ThreadFactoryImpl(10, new ThreadGroup("ts"), "test-consumer", new AtomicInteger(1)));

			for (int i = 0; i < 5; i++) {
				int li = i;
				es.submit(() -> {
					log.debug("test submit: " + li);

					try {
						if (li == 2) {
							int k = 5 / 0; // This exception will be logged & the thread will go in waiting state
						}

						while (true) {
							log.debug("TS TEST");
							Thread.sleep(10000);
						}
					} catch (Exception e) {
						log.error(e.getMessage(), e);
					}

				});
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	public void main() {
		log.debug("main service");

		start();
	}
}
