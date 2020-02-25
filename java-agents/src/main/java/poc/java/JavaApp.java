package poc.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import poc.java.service.JavaService;

/**
 * @author ashishb888
 */

@Slf4j
@SpringBootApplication
public class JavaApp implements CommandLineRunner {

	@Autowired
	private JavaService streamService;

	public static void main(String[] args) {
		SpringApplication.run(JavaApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.debug("run service");

		streamService.main();
	}

}
