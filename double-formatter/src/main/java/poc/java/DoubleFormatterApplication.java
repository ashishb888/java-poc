package poc.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;
import poc.java.service.BigDecimalService;
import poc.java.service.DoubleFormatterService;

@Slf4j
@SpringBootApplication
public class DoubleFormatterApplication {

	@Autowired
	private DoubleFormatterService dfs;
	@Autowired
	private BigDecimalService bds;

	public static void main(String[] args) {
		SpringApplication.run(DoubleFormatterApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ac) {
		return args -> {
			log.debug("run service");

			bds.main();
			// dfs.main();
		};
	}
}
