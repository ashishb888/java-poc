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

@SpringBootApplication
@Slf4j
public class JavaApp implements CommandLineRunner {
	@Autowired
	private JavaService javaCollectionService;

	public static void main(String[] args) {
		SpringApplication.run(JavaApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("run service");

		javaCollectionService.main();
	}

}
