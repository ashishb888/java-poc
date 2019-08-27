package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import poc.java.domain.PrototypeImpl1;
import poc.java.domain.PrototypeImpl2;
import poc.java.domain.TestDomain;

@Service
@Log
public class PrototypeService {

	private void prototype() {
		log.info("prototype service");

		PrototypeImpl1 p1 = new PrototypeImpl1("PT1", new TestDomain("PT1", 10));
		PrototypeImpl2 p2 = new PrototypeImpl2("PT2", new TestDomain("PT2", 20));

		log.info("p1: " + p1);
		log.info("p2: " + p2);

		try {
			PrototypeImpl1 p1Clone = p1.clone();
			PrototypeImpl2 p2Clone = p2.clone();

			p1Clone.setName("p1Clone");
			p1Clone.getTd().setName("p1Clone"); // Shallow clone

			log.info("p1: " + p1);

			log.info("p1Clone: " + p1Clone);
			log.info("p2Clone: " + p2Clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public void main() {
		log.info("main service starts");

		prototype();

		log.info("main service ends");
	}
}
