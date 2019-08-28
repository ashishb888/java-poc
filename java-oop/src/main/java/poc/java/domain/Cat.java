package poc.java.domain;

import lombok.extern.java.Log;

@Log
public class Cat extends Animal {
	public static void testClassMethod() {
		log.info("The static method in Cat");
	}

	public void testInstanceMethod() {
		log.info("The instance method in Cat");
	}

	public void m1() {
		log.info("Cat: m1");
	}

}
