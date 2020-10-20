package poc.java.service;

import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StringVsBytesService {

	private void stringComparison() {
		log.debug("stringComparison service");

		String s1 = "Hello";
		String s2 = "Hello";

		log.debug("String comparison starts");

		IntStream.range(0, 5000).forEach(i -> {
			boolean b = s1.equals(s2);
		});

		log.debug("String comparison ends");
	}

	private void bytesComparison() {
		log.debug("bytesComparison service");

		String s1 = "Hello";
		String s2 = "Hello";

		byte[] ba1 = s1.getBytes();
		byte[] ba2 = s2.getBytes();

		log.debug("Bytes comparison starts");

		IntStream.range(0, 5000).forEach(i -> {
			boolean b = ba1.equals(ba2);
		});

		log.debug("Bytes comparison ends");
	}

	public void main() {
		log.debug("main service");

		stringComparison();
		bytesComparison();
	}
}
