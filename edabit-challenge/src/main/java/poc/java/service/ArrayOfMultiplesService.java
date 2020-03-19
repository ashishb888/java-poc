package poc.java.service;

import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class ArrayOfMultiplesService {

	public int[] arrayOfMultiples(int num, int length) {
		return IntStream.range(1, length + 1).map(i -> num * i).toArray();
	}
}
