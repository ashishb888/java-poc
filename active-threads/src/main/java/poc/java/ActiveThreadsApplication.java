package poc.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import poc.java.service.ActiveThreadsService;

@SpringBootApplication
public class ActiveThreadsApplication {

	@Autowired
	private ActiveThreadsService ats;

	public static void main(String[] args) {
		SpringApplication.run(ActiveThreadsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ac) {
		return args -> {
			ats.main();
		};
	}
}
