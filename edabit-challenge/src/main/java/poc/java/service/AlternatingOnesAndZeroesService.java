package poc.java.service;

import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class AlternatingOnesAndZeroesService {

	public boolean canAlternate(String str) {
		int strLength = str.length();

		if (strLength < 2)
			return false;

		int countOf0 = (int) Stream.of(str.split("")).filter(e -> "0".equals(e)).count();
		// int countOf0 = (int) str.chars().filter(e -> e == 1).count();
		int diff = (strLength - countOf0) - countOf0;

		if (diff == -1 || diff == 1 || diff == 0)
			return true;

		return false;
	}
}
