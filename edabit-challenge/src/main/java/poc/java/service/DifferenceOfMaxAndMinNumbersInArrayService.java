package poc.java.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class DifferenceOfMaxAndMinNumbersInArrayService {

	public int differenceMaxMin(int[] arr) {
		// Arrays.sort(arr);
		// return arr[arr.length - 1] - arr[0];

		return Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
	}
}
