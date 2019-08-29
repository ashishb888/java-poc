package poc.java.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Service
@Log
public class PSStreamService {

	private int transform(int i) {
		log.info("transform");
		return i;
	}

	private void sequential() {
		log.info("sequential service");

//		List<Integer> numbers = IntStream.iterate(0, i -> i + 1).limit(10).mapToObj(Integer::valueOf)
//				.collect(Collectors.toList());

		List<Integer> numbers = IntStream.iterate(1, i -> i + 1).limit(10).boxed().collect(Collectors.toList());

		// numbers.stream().forEach(System.out::println);
		numbers.stream().map(e -> transform(e));// .forEach(e -> log.info("e: " + e));

		int min = numbers.stream().mapToInt(i -> i).min().getAsInt();
		log.info("min: " + min);

		int max = numbers.stream().mapToInt(i -> i).max().getAsInt();
		log.info("max: " + max);

		int sum = numbers.stream().mapToInt(i -> i).sum();
		log.info("sum: " + sum);

		int first = numbers.stream().findFirst().get();
		log.info("first: " + first);

		int last = numbers.stream().reduce((f, s) -> s).get();
		log.info("last: " + last);

		last = numbers.stream().skip(numbers.stream().count() - 1).findFirst().get();
		log.info("last: " + last);
	}

	private void parallel() {
		log.info("parallel service");

//		List<Integer> numbers = IntStream.iterate(0, i -> i + 1).limit(10).mapToObj(Integer::valueOf)
//				.collect(Collectors.toList());

		List<Integer> numbers = IntStream.iterate(1, i -> i + 1).limit(10).boxed().collect(Collectors.toList());

		// numbers.stream().forEach(System.out::println);
		numbers.stream().parallel().map(e -> transform(e));// .forEach(e -> log.info("e: " + e));

		int min = numbers.stream().parallel().mapToInt(i -> i).min().getAsInt();
		log.info("min: " + min);

		int max = numbers.stream().parallel().mapToInt(i -> i).max().getAsInt();
		log.info("max: " + max);

		int sum = numbers.stream().parallel().mapToInt(i -> i).sum();
		log.info("sum: " + sum);

		int first = numbers.stream().parallel().findFirst().get();
		log.info("first: " + first);

		int last = numbers.stream().parallel().reduce((f, s) -> s).get();
		log.info("last: " + last);

		last = numbers.stream().parallel().skip(numbers.stream().count() - 1).findFirst().get();
		log.info("last: " + last);
	}

	public void main() {
		log.info(this.getClass().getName() + ": main service");

		sequential();
		// parallel();

	}
}
