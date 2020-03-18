package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.SevenBoomService;

@SpringBootTest
public class SevenBoomServiceTest {

	@Autowired
	private SevenBoomService sbs;

	@Test
	public void test1() {
		assertEquals("Boom!", sbs.sevenBoom(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
	}

	@Test
	public void test2() {
		assertEquals("there is no 7 in the array", sbs.sevenBoom(new int[] { 8, 6, 33, 100 }));
	}

	@Test
	public void test3() {
		assertEquals("Boom!", sbs.sevenBoom(new int[] { 2, 55, 60, 97, 86 }));
	}
}
