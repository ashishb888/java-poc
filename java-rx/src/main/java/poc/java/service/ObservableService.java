package poc.java.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.reactivex.Observable;
import lombok.extern.slf4j.Slf4j;
import poc.java.domain.Employee;
import poc.java.domain.Gender;
import poc.java.repos.EmployeeRepository;

@Service
@Slf4j
@SuppressWarnings("unused")
public class ObservableService {

	@Autowired
	private EmployeeRepository er;

	private void just() {
		log.info("just service");

		List<Employee> employees = er.getAll(5);

		Observable<Employee> observable = Observable.just(employees.get(0), employees.get(1));
		observable.subscribe(e -> {
			log.info("e: " + e);
		});
	}

	private void from() {
		log.info("from service");

		List<Employee> employees = er.getAll(5);

		Observable<Employee> observable = Observable.fromArray(employees.toArray(new Employee[employees.size()]));

		observable.subscribe(data -> {
			log.info("data: " + data);
		}, error -> {
			log.error("error", error);
		}, () -> {
			log.info("Completed");
		});

		observable.filter(e -> e.getGender() == Gender.MALE).subscribe(data -> {
			log.info("data: " + data);
		}, error -> {
			log.error("error", error);
		}, () -> {
			log.info("Completed");
		});

		observable.filter(e -> e.getGender() == Gender.FEMALE).subscribe(data -> {
			log.info("data: " + data);
		}, error -> {
			log.error("error", error);
		}, () -> {
			log.info("Completed");
		});
	}

	public void main() {
		log.info("main service");

		// just();
		from();
	}
}
