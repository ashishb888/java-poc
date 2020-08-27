package poc.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import poc.java.service.ByteBufferService;

@SpringBootApplication
public class JavaBytebufferApplication {

	@Autowired
	private ByteBufferService bbs;

	public static void main(String[] args) {
		SpringApplication.run(JavaBytebufferApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ac) {
		return args -> {
			bbs.main();
		};
	}
}
