package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class SevenBoomService {

	public String sevenBoom(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (String.valueOf(arr[i]).contains("7"))
				return "Boom!";
		}

		return "there is no 7 in the array";
	}
}
