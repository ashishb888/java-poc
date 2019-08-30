package poc.java.repos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import poc.java.domain.Fruit;

@Repository
public class FruitRepository {

	public List<Fruit> getAll(int limit) {

		List<Fruit> fruits = Arrays.asList(new Fruit("apple", 100, 10), new Fruit("banana", 100, 20),
				new Fruit("pear", 160, 13), new Fruit("apple", 50, 5), new Fruit("pear", 160, 13),
				new Fruit("apple", 150, 15), new Fruit("banana", 100, 20), new Fruit("apple", 70, 7),
				new Fruit("banana", 50, 10), new Fruit("pear", 100, 5), new Fruit("banana", 60, 12),
				new Fruit("pear", 100, 5), new Fruit("banana", 25, 5), new Fruit("pear", 60, 3),
				new Fruit("apple", 70, 7), new Fruit("pear", 160, 13)

		);

		return fruits.stream().limit(limit).collect(Collectors.toList());
	}
}
