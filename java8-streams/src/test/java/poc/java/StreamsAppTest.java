package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import poc.java.service.ExampleService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class StreamsAppTest {

	@Autowired
	private ExampleService es;
	
	@Test
	public void examples() {
		assertEquals(1, es.main());
	}
}
