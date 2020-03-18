package poc.java.service;

import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class FindTheMissingLetterService {

	public String missingLetter(String[] arr) {
		String joinedStr = String.join("", arr);
		int si = joinedStr.charAt(0);
		int ei = joinedStr.charAt(arr.length - 1) + 1;
		int expectedSum = IntStream.range(si, ei).sum();
		int sum = joinedStr.chars().sum();
		int diff = expectedSum - sum;

		return Character.toString((char) diff);
	}
}
