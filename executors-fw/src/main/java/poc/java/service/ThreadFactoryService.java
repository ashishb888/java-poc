package poc.java.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

		ExecutorService es = Executors.newFixedThreadPool(5,
				new ThreadFactoryImpl(10, new ThreadGroup("kafka-consumers"), "kafka-consumer"));

		for (int i = 0; i < 5; i++) {
			int li = i;
			es.submit(() -> {
				log.debug("submit: " + li);
			});
		}
	}

	public void main() {
		log.debug("main service");

		start();
	}
}
