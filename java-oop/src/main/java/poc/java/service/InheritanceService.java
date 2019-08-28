package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import poc.java.domain.Animal;
import poc.java.domain.Cat;

@Service
@Log
public class InheritanceService {

	public void inheritance() {
		log.info("inheritance service");

		Animal myAnimal = new Cat();
		myAnimal.testInstanceMethod();

		Animal.testClassMethod();
		Cat.testClassMethod();
	}

	public void main() {
		log.info(this.getClass().getName() + ": main service");

		inheritance();
	}

}
