package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class StringEndingMatchesSecondStringService {

	public boolean checkEnding(String str1, String str2) {
		if (!str1.contains(str2))
			return false;
		
		return str1.substring(str1.length() - str2.length()).equals(str2);
	}
}
