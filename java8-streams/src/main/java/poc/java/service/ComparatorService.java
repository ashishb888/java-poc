package poc.java.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import poc.java.domain.Employee;
import poc.java.repos.StreamsRepository;

@Service
@Log
public class ComparatorService {
	@Autowired
	private StreamsRepository sr;

	private void sortByAge(List<Employee> employees) {
		log.info("sortByAge service");

		employees.sort((Employee e1, Employee e2) -> e1.getAge() - e2.getAge());
	}

	private void sortByName(List<Employee> employees) {
		log.info("sortByName service");

		employees.sort((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
	}

	private void sortBySalary(List<Employee> employees) {
		log.info("sortBySalary service");

		employees.sort((Employee e1, Employee e2) -> Double.compare(e1.getSalary(), (e2.getSalary())));
	}

	private void sortByNameAndAge(List<Employee> employees) {
		log.info("sortByNameAndAge service");

		employees.sort(Comparator.comparing(Employee::getName).thenComparingInt(Employee::getAge));
	}

	private void sort() {
		log.info("sort service");

		List<Employee> employees = sr.getAll(4);

		log.info("before sort employees: ");

		employees.forEach(e -> {
			log.info("e: " + e);
		});

		// sortByAge(employees);
		// sortByName(employees);
		// csortBySalary(employees);
		sortByNameAndAge(employees);

		log.info("after sort employees: ");

		employees.forEach(e -> {
			log.info("e: " + e);
		});
	}

	private void compare() {
		log.info("compare service");

		List<Employee> employees = sr.getAll(10);

		Comparator.comparing(Employee::getAge);

		// employees.stream().filter(e-> )
	}

	public void main() {
		log.info(this.getClass().getName() + ": main service");

		sort();
	}
}
