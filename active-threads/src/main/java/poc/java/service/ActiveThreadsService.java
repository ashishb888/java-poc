package poc.java.service;

import java.lang.management.ManagementFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ActiveThreadsService {

	private AtomicBoolean run = new AtomicBoolean(true);

	private void tasks() {
		log.debug("tasks service");

		ExecutorService es = Executors.newFixedThreadPool(10);

		IntStream.range(0, 10).forEach(i -> {
			es.submit(() -> {

				while (run.get()) {
					log.debug("es service");

					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						log.error(e.getMessage(), e);
					}
				}
			});
		});

		es.shutdown();
	}

	private void activeThreads() {
		log.debug("activeThreads service");

		ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
		Runnable activeThreads = () -> log
				.debug("activeThreads: " + ManagementFactory.getThreadMXBean().getThreadCount());

		ses.scheduleAtFixedRate(activeThreads, 1000, 5000, TimeUnit.MILLISECONDS);
		// ses.shutdown();
	}

	private void shutdown() {
		log.debug("shutdown service");

		ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
		ses.schedule(() -> run.getAndSet(false), 2, TimeUnit.MINUTES);
		ses.shutdown();
	}

	public void main() {
		log.debug("main service");
		tasks();
		shutdown();
		activeThreads();
	}
}
