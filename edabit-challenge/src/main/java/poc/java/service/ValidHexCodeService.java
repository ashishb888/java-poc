package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class ValidHexCodeService {

	public boolean isValidHexCode(String str) {
		return str.matches("#[A-Fa-f0-9]{6}");
	}
}
