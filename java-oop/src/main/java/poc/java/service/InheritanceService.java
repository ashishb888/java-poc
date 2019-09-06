package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import poc.java.domain.Animal;
import poc.java.domain.Cat;

@Service
@Log
@SuppressWarnings("static-access")
public class InheritanceService {

	public void inheritance() {
		log.info("inheritance service");

		Animal myAnimal = new Cat();
		myAnimal.testInstanceMethod();
		myAnimal.testClassMethod();
		((Cat) myAnimal).m1();

		Animal.testClassMethod();
		Cat.testClassMethod();

		Animal a = new Animal();
		a.testInstanceMethod();
		a.testClassMethod();
	}

	public void main() {
		log.info(this.getClass().getName() + ": main service");

		inheritance();
	}

}
