package poc.java.service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import poc.java.domain.Fruit;
import poc.java.repos.FruitRepository;

@Service
@Log
@SuppressWarnings("unused")
public class GroupingByService {

	@Autowired
	private FruitRepository fs;

	private void groupingByName(List<Fruit> fruits) {
		log.info("groupByName service");

		Map<String, List<Fruit>> byNames = fruits.stream().collect(Collectors.groupingBy(Fruit::getName));

		byNames.forEach((k, v) -> {
			log.info("k: " + k + ", v: " + v);
		});
	}

	private void groupingByNameAndCount(List<Fruit> fruits) {
		log.info("groupingByNameAndCount service");

		Map<String, Long> countByName = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));

		log.info("countByName: " + countByName);
	}

	private void groupingByIdentityAndCount(List<Fruit> fruits) {
		log.info("groupingByIdentityAndCount service");

		Map<Fruit, Long> countByIdentity = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		log.info("countByIdentity: " + countByIdentity);
	}

	private void groupingByNameAndSum(List<Fruit> fruits) {
		log.info("groupingByNameAndSum service");

		Map<String, Integer> result = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getName, Collectors.summingInt(Fruit::getQuantity)));

		log.info("result: " + result);
	}

	private void groupingByNameAndPrice(List<Fruit> fruits) {
		log.info("groupingByNameAndPrice service");

		Map<String, Map<Double, List<Fruit>>> result = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getName, Collectors.groupingBy(Fruit::getPrice)));

		log.info("result: " + result);
	}

	private void groupingBy() {
		log.info("groupingBy service");

		List<Fruit> fruits = fs.getAll(5);
		log.info("fruits: " + fruits);

		// groupingByName(fruits);
		// groupingByNameAndCount(fruits);
		// groupingByIdentityAndCount(fruits);
		// groupingByNameAndSum(fruits);
		groupingByNameAndPrice(fruits);

	}

	public void main() {
		log.info(this.getClass().getName() + ": main service");

		groupingBy();
	}

}
