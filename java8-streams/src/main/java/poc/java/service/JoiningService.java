package poc.java.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import poc.java.domain.Employee;
import poc.java.repos.StreamsRepository;
import poc.java.repos.StringRepository;

@Service
@Log
@SuppressWarnings(value = "unused")
public class JoiningService {
	@Autowired
	private StringRepository sr;

	private void joining(List<String> strings) {
		log.info("joining service");

		String result = strings.stream().collect(Collectors.joining());
		log.info("result: " + result);
	}

	private void joiningBy(List<String> strings, CharSequence delimiter) {
		log.info("joiningBy service");

		String result = strings.stream().collect(Collectors.joining(delimiter));
		log.info("result: " + result);
	}

	private void joiningPreSuf(List<String> strings, CharSequence delimiter, CharSequence prefix, CharSequence suffix) {
		log.info("joiningPreSuf service");

		String result = strings.stream().collect(Collectors.joining(delimiter, prefix, suffix));
		log.info("result: " + result);
	}

	private void join() {
		log.info("join service");

		List<String> strings = sr.getAll(4);
		log.info("strings: " + strings);

		joining(strings);
		joiningBy(strings, " ");
		joiningBy(strings, ", ");
		joiningPreSuf(strings, " ", "START-----", "-----END");
	}

	public void main() {
		log.info("main service");

		join();
	}
}
