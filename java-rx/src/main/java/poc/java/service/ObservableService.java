package poc.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.reactivex.Observable;
import lombok.extern.slf4j.Slf4j;
import poc.java.domain.Employee;
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

	public void main() {
		log.info("main service");

		just();
	}
}
