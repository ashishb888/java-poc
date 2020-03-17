package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.WordCountService;

@SpringBootTest
public class WordCountServiceTest {

	@Autowired
	private WordCountService wcs;

	@Test
	public void test1() {
		assertEquals(6, wcs.countWords("Just an example here move along"));
	}

	@Test
	public void test2() {
		assertEquals(4, wcs.countWords("This is a test"));
	}

	@Test
	public void test3() {
		assertEquals(5, wcs.countWords("What an easy task, right"));
	}
}
