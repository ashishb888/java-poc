package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.FindTheMissingLetterService;

@SpringBootTest
public class DifferenceOfMaxAndMinNumbersInArrayServiceTest {
	@Autowired
	private FindTheMissingLetterService service;

	@Test
	public void test1() {
		assertEquals("d", service.missingLetter(new String[] { "a", "b", "c", "e", "f", "g" }));
	}

	@Test
	public void test2() {
		assertEquals("P", service.missingLetter(new String[] { "O", "Q", "R", "S" }));
	}

	@Test
	public void test3() {
		assertEquals("y", service.missingLetter(new String[] { "t", "u", "v", "w", "x", "z" }));
	}

	@Test
	public void test4() {
		assertEquals("n", service.missingLetter(new String[] { "m", "o" }));
	}
}
