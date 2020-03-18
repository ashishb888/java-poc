package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.AlternatingOnesAndZeroesService;

@SpringBootTest
public class AlternatingOnesAndZeroesServiceTest {
	@Autowired
	private AlternatingOnesAndZeroesService aoazs;

	@Test
	public void test1() {
		assertEquals(true, aoazs.canAlternate("0001111"));
	}

	@Test
	public void test2() {
		assertEquals(true, aoazs.canAlternate("10101010"));
	}

	@Test
	public void test3() {
		assertEquals(false, aoazs.canAlternate("010001"));
	}
}
