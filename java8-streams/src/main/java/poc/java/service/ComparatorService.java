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

	private void sort() {
		log.info("sort service");

		List<Employee> employees = sr.getAll(4);

		log.info("before sort employees: " + employees);

		sortByAge(employees);

		log.info("after sort employees: " + employees);
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
