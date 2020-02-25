package poc.java.agent;

public class StaticAgent {
	public static void premain(String arg) {
		System.out.println("Hello from " + arg);
	}
}
