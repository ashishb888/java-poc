package poc.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import poc.java.service.JavaCollectionService;

/**
 * @author ashishb888
 */

@SpringBootApplication
@Slf4j
public class JavaCollectionApp implements CommandLineRunner {
	@Autowired
	private JavaCollectionService javaCollectionService;

	public static void main(String[] args) {
		SpringApplication.run(JavaCollectionApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("run service");

		javaCollectionService.main();
	}

}
