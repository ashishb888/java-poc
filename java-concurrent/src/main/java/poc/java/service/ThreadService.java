package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Service
@Log
public class ThreadService {

	private void join() {
		log.info("join service");

		Thread t1 = new Thread(() -> log.info("Thread: " + Thread.currentThread().getName()), "T1");

		Thread t2 = new Thread(() -> {
			log.info("Thread: " + Thread.currentThread().getName());

			try {
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "T2");

		Thread t3 = new Thread(() -> {
			log.info("Thread: " + Thread.currentThread().getName());

			try {
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "T3");

		t1.start();
		t2.start();
		t3.start();

	}

	public void main() {
		log.info(this.getClass().getName() + ": main service starts");

		join();

		log.info(this.getClass().getName() + ": main service ends");
	}
}
