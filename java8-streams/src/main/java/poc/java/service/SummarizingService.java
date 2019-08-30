package poc.java.service;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
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
public class SummarizingService {
	@Autowired
	private StringRepository sr;

	private void summarizingInt(List<String> strings) {
		log.info("summarizingInt service");

		IntSummaryStatistics result = strings.stream().collect(Collectors.summarizingInt(String::length));
		log.info("result: " + result);
	}

	private void summarizingDouble(List<String> strings) {
		log.info("summarizingDouble service");

		DoubleSummaryStatistics result = strings.stream().collect(Collectors.summarizingDouble(String::length));
		log.info("result: " + result);
	}

	private void summarize() {
		log.info("summarize service");

		List<String> strings = sr.getAll(10);
		log.info("strings: " + strings);

		summarizingInt(strings);
		summarizingDouble(strings);
	}

	public void main() {
		log.info("main service");

		summarize();
	}
}
