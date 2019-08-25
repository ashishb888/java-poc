package poc.java.repos;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import poc.java.domain.Employee;
import poc.java.domain.Gender;

@Repository
public class StreamsRepository {

	public List<Employee> getAll() {

		return Arrays.asList(new Employee("A", 28, 8000, "IT", Gender.MALE),
				new Employee("A", 20, 10000, "TESTING", Gender.FEMALE), new Employee("X", 38, 8000, "IT", Gender.MALE),
				new Employee("B", 28, 18000, "IT", Gender.MALE), new Employee("P", 28, 20000, "IT", Gender.FEMALE),
				new Employee("C", 28, 8000, "IT", Gender.MALE), new Employee("Y", 28, 80000, "QA", Gender.MALE),
				new Employee("A", 28, 8000, "IT", Gender.MALE), new Employee("A", 28, 9000, "IT", Gender.MALE),
				new Employee("A", 40, 25000, "IT", Gender.FEMALE), new Employee("A", 28, 30000, "QA", Gender.MALE),
				new Employee("C", 28, 8000, "IT", Gender.FEMALE), new Employee("Z", 28, 45000, "IT", Gender.MALE));

	}

}
