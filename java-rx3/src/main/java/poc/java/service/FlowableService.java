package poc.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.reactivex.rxjava3.core.Flowable;
import lombok.extern.slf4j.Slf4j;
import poc.java.domain.Employee;
import poc.java.repos.EmployeeRepository;

@Slf4j
@SuppressWarnings("unused")
@Service
public class FlowableService {

	@Autowired
	private EmployeeRepository er;

	private void just() {
		log.info("just service");

		List<Employee> employees = er.getAll(5);
		Flowable<Employee> flowable = Flowable.just(employees.get(0), employees.get(1));

		flowable.subscribe(data -> {
			log.info("data: " + data);
		}, error -> {
			log.info("error: " + error);
		}, () -> {
			log.info("Completed");
		});

	}

	public void main() {
		log.info("main service");

		just();
	}
}
