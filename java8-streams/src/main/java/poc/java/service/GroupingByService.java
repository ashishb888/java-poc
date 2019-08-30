package poc.java.service;

import java.util.List;
import java.util.Map;
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

	private void groupingBy() {
		log.info("groupingBy service");

		List<Fruit> fruits = fs.getAll(5);
		log.info("fruits: " + fruits);

		// groupingByName(fruits);
		groupingByNameAndCount(fruits);
	}

	public void main() {
		log.info(this.getClass().getName() + ": main service");

		groupingBy();
	}

}
