package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.StringEndingMatchesSecondStringService;

@SpringBootTest
public class StringEndingMatchesSecondStringServiceTest {
	@Autowired
	private StringEndingMatchesSecondStringService semsss;

	@Test
	public void test1() {
		assertEquals(true, semsss.checkEnding("abc", "bc"));
	}

	@Test
	public void test2() {
		assertEquals(false, semsss.checkEnding("abc", "d"));
	}

	@Test
	public void test3() {
		assertEquals(false, semsss.checkEnding("samurai", "zi"));
	}

	@Test
	public void test4() {
		assertEquals(true, semsss.checkEnding("feminine", "nine"));
	}

	@Test
	public void test5() {
		assertEquals(false, semsss.checkEnding("convention", "tio"));
	}
}
