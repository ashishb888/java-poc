package poc.java.staticagent;

public class PreEntry {
	public static void premain(String arg) {
		System.out.println("Hello from " + arg);
	}
}
