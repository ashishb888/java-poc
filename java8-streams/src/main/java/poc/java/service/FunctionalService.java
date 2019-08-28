package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import poc.java.domain.Arithmetic;
import poc.java.domain.ArithmeticImpl;

@Service
@Log
public class FunctionalService {

	private void arithmetic() {
		log.info("arithmetic service");

		Arithmetic add = (a, b) -> a + b;
		Arithmetic substract = (a, b) -> a - b;
		Arithmetic division = (a, b) -> a / b;
		Arithmetic multiplication = (a, b) -> a * b;
		Arithmetic mod = (a, b) -> a % b;

		log.info("add: " + add.perform(10, 20));
		log.info("substract: " + substract.perform(10, 20));
		log.info("division: " + division.perform(10, 20));
		log.info("multiplication: " + multiplication.perform(10, 20));
		log.info("mod: " + mod.perform(10, 20));

		String helloStatic = Arithmetic.sayHelloToStatic("Ashish");
		log.info("helloStatic: " + helloStatic);

		Arithmetic a = new ArithmeticImpl();
		String helloDefault = a.sayHelloToDefault("Ashish");
		log.info("helloDefault: " + helloDefault);
	}

	public void main() {
		log.info(this.getClass().getName() + ": main service");

		arithmetic();
	}
}
