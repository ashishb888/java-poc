package poc.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import poc.java.service.ConcurrentService;

/**
 * @author ashishb888
 */

@SpringBootApplication
public class ConcurrentApp implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ConcurrentService concurrentService;

	public static void main(String[] args) {
		SpringApplication.run(ConcurrentApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("run service");

		concurrentService.main();
	}

}
