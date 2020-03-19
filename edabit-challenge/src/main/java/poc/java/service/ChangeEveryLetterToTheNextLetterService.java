package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class ChangeEveryLetterToTheNextLetterService {

	public String move(String word) {
		char[] chars = word.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < chars.length; i++) {
			sb.append(Character.toString((char) (chars[i] + 1)));
		}

		return sb.toString();
	}
}
