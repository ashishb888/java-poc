package poc.java.service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class StateNamesAndAbbreviationsService {

	public String[] filterStateNames(String[] arr, String type) {
		switch (type) {
		case "abb":
			return filterArray(arr, r -> r.length() == 2);
		case "full":
			return filterArray(arr, r -> r.length() > 2);
		default:
			return null;
		}
	}

	private String[] filterArray(String[] arr, Predicate<String> predicate) {
		List<String> ls = Arrays.stream(arr).filter(predicate).collect(Collectors.toList());
		return ls.toArray(new String[ls.size()]);
	}
}
