package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class CompoundingLettersService {

	public String accum(String str) {
		String[] sArr = str.split("");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < sArr.length; i++) {
			sb.append(repeat(sArr[i], i)).append("-");
		}

		return sb.substring(0, sb.length() - 1);
	}

	private String repeat(String s, int n) {
		StringBuilder sb = new StringBuilder(s.toUpperCase());
		String lc = s.toLowerCase();

		for (int i = 0; i < n; i++) {
			sb.append(lc);
		}

		return sb.toString();
	}
}
