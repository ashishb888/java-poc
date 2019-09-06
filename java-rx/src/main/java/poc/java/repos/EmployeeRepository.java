package poc.java.repos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import poc.java.domain.Employee;
import poc.java.domain.Gender;

@Repository
public class EmployeeRepository {

	public List<Employee> getAll(int limit) {

		List<Employee> employees = Arrays.asList(new Employee("M", 28, 8000, "IT", Gender.MALE),
				new Employee("F", 20, 10000, "TESTING", Gender.FEMALE), new Employee("X", 38, 80000, "IT", Gender.MALE),
				new Employee("B", 28, 18000, "IT", Gender.MALE), new Employee("P", 80, 20000, "IT", Gender.FEMALE),
				new Employee("C", 48, 3500, "IT", Gender.MALE), new Employee("Y", 25, 80000, "QA", Gender.MALE),
				new Employee("A", 50, 8000, "IT", Gender.MALE), new Employee("A", 29, 9000, "IT", Gender.MALE),
				new Employee("A", 40, 25000, "IT", Gender.FEMALE), new Employee("A", 28, 30000, "QA", Gender.MALE),
				new Employee("C", 28, 22000, "IT", Gender.FEMALE), new Employee("Z", 60, 45000, "IT", Gender.MALE));

		return employees.stream().limit(limit).collect(Collectors.toList());
	}
}
