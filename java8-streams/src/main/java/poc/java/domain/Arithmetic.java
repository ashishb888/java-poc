package poc.java.domain;

@FunctionalInterface
public interface Arithmetic {

	int perform(int a, int b);

	default String sayHelloToDefault(String name) {
		return "Hello, " + name;
	}

	static String sayHelloToStatic(String name) {
		return "Hello, " + name;
	}
}
