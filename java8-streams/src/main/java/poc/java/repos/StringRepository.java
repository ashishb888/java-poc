package poc.java.repos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class StringRepository {

	public List<String> getAll(int limit) {

		List<String> strings = Arrays.asList("apple", "banana", "pear", "watermelon", "orage", "pineaple", "apple",
				"banana", "pear", "watermelon", "orage", "pineaple"

		);

		return strings.stream().limit(limit).collect(Collectors.toList());
	}
}
