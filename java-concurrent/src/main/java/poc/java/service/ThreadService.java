package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Service
@Log
@SuppressWarnings("unused")
public class ThreadService {

	static boolean done;

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

	static class Task implements Runnable {
		static boolean done;

		@Override
		public void run() {
			log.info(Thread.currentThread().getName() + " running");

			int count = 0;

			while (!done) {
				count++;
			}

			log.info(Thread.currentThread().getName() + " finished");
		}

	}

//	public class Test {
//		static boolean done;
//
//		public static void main(String[] args) throws Exception {
//
//			done = false;
//
//			new Thread(() -> {
//				log.info(Thread.currentThread().getName() + " running");
//
//				int count = 0;
//
//				while (!done) {
//					count++;
//				}
//
//				log.info(Thread.currentThread().getName() + " finished");
//			}, "without-sleep").start();
//
//			Thread.sleep(2000);
//
//			done = true;
//		}
//
//	}

	// Test class code and withoutSleep behaves differently
	// If we do not put sleep in while loop it will run forever. It will not stop
	// after 2000 millis

	private void withoutSleep() {
		log.info("withoutSleep service");

		done = false;

		new Thread(() -> {
			log.info(Thread.currentThread().getName() + " running");

			int count = 0;

			while (!done) {
				count++;
			}

			log.info(Thread.currentThread().getName() + " finished");
		}, "without-sleep").start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		done = true;
	}

	private void withSleep() {
		log.info("withSleep service");

		log.info("withoutSleep service");

		done = false;

		new Thread(() -> {
			log.info(Thread.currentThread().getName() + " running");

			int count = 0;

			while (!done) {
				count++;
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			log.info(Thread.currentThread().getName() + " finished");
		}, "with-sleep").start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		done = true;
	}

	public void main() {
		log.info(this.getClass().getName() + ": main service starts");

		// join();
		withoutSleep();
		withSleep();

		log.info(this.getClass().getName() + ": main service ends");
	}
}
