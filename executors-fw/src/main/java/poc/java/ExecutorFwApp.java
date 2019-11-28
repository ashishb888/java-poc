package poc.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import poc.java.service.ExecutorFwService;

/**
 * @author ashishb888
 */

@SpringBootApplication
@Slf4j
public class ExecutorFwApp implements CommandLineRunner {
	@Autowired
	private ExecutorFwService efs;

	public static void main(String[] args) {
		SpringApplication.run(ExecutorFwApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.debug("run service");

		efs.main();
	}

}
