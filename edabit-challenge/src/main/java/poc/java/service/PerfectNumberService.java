package poc.java.service;

import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class PerfectNumberService {

	public boolean checkPerfect(int num) {
		int limit = num / 2;
		return num == IntStream.rangeClosed(1, limit).filter(i -> num % i == 0).sum();
	}
}
