package poc.java.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import poc.java.domain.Singleton;

@Service
@Log
public class SingletonService {

	private void singleton() {
		log.info("singleton service");

		ExecutorService es = Executors.newFixedThreadPool(10);

		IntStream.range(0, 10).forEach(i -> {
			es.submit(() -> {
				log.info(Thread.currentThread().getName() + ": singleton: " + Singleton.getInstance());
			}, "Thread: " + i);
		});
	}

	public void main() {
		log.info(this.getClass().getName() + ": main service starts");

		singleton();

		log.info(this.getClass().getName() + ": main service ends");
	}
}
