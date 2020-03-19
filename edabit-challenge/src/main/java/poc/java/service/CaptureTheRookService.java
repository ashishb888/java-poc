package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class CaptureTheRookService {

	public boolean canCapture(String[] rooks) {
		String[] sArr = rooks[1].split("");

		if (rooks[0].contains(sArr[0]) || rooks[0].contains(sArr[1]))
			return true;

		return false;
	}
}
