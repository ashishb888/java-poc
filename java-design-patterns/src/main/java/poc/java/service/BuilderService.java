package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import poc.java.domain.Employee;
import poc.java.domain.Gender;

@Service
@Log
public class BuilderService {

	private void lombokBuilder() {
		log.info("lombokBuilder service");

		Employee empA = Employee.builder().name("A").department("IT").gender(Gender.MALE).age(18).build();
		log.info("empA: " + empA);
	}

	public void main() {
		log.info("main service");

		lombokBuilder();
	}
}
