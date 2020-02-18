package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.ExampleService;

@SpringBootTest
public class StreamsAppTest {

	@Autowired
	private ExampleService es;
	
	@Test
	public void examples() {
		assertEquals(1, es.main());
	}
}
