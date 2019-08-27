package poc.java.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Singleton {
	private static Singleton instance;

	public static Singleton getInstance() {

		if (instance == null) {

			synchronized (Singleton.class) {
				if (instance == null)
					instance = new Singleton();
			}
		}

		return instance;
	}

}
