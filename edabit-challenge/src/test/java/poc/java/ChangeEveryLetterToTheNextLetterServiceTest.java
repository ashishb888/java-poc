package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.ChangeEveryLetterToTheNextLetterService;

@SpringBootTest
public class ChangeEveryLetterToTheNextLetterServiceTest {

	@Autowired
	private ChangeEveryLetterToTheNextLetterService service;

	@Test
	public void test1() {
		assertEquals("ifmmp", service.move("hello"));
	}

	@Test
	public void test2() {
		assertEquals("czf", service.move("bye"));
	}

	@Test
	public void test3() {
		assertEquals("xfmdpnf", service.move("welcome"));
	}
}
