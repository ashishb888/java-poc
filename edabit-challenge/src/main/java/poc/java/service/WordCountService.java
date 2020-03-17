package poc.java.service;

import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class WordCountService {
	public int countWords(String s) {
		// return (int) s.split("\\ ").length;
		return (int) Stream.of(s.split("\\ ")).count();
	}
}
