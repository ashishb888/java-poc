package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class FindTheSecondOccurrenceOfZipInStringService {

	public int findZip(String str) {
		String zip = "zip";
		int index = str.indexOf(zip);

		return index == -1 ? index : str.indexOf(zip, index + 3);
	}
}
