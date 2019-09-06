package poc.java;

import lombok.extern.java.Log;

@Log
@SuppressWarnings("unused")
public class Test {
	static boolean done;

	public static void main(String[] args) throws Exception {

		done = false;

		new Thread(() -> {
			log.info(Thread.currentThread().getName() + " running");

			int count = 0;

			while (!done) {
				count++;
			}

			log.info(Thread.currentThread().getName() + " finished");
		}, "without-sleep").start();

		Thread.sleep(2000);

		done = true;
	}

}
