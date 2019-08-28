package poc.java.domain;

import lombok.extern.java.Log;

@Log
public class Animal {
	public static void testClassMethod() {
		log.info("The static method in Animal");
	}

	public void testInstanceMethod() {
		log.info("The instance method in Animal");
	}
}
