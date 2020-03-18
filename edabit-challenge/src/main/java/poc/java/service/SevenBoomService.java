package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class SevenBoomService {

	public String sevenBoom(int[] arr) {

		// return Arrays.toString(arr).contains("7") ? "Boom!" : "there is no 7 in the
		// array";

		for (int i = 0; i < arr.length; i++) {
			if (String.valueOf(arr[i]).contains("7"))
				return "Boom!";
		}

		return "there is no 7 in the array";
	}
}
