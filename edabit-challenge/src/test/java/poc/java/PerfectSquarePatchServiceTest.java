package poc.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.PerfectSquarePatchService;

@SpringBootTest
public class PerfectSquarePatchServiceTest {

	@Autowired
	private PerfectSquarePatchService service;

	@Test
	public void test1() {
		assertArrayEquals(new int[][] { { 3, 3, 3 }, { 3, 3, 3 }, { 3, 3, 3 } }, service.squarePatch(3));
	}

	@Test
	public void test2() {
		assertArrayEquals(new int[][] { { 1 } }, service.squarePatch(1));
	}

	@Test
	public void test3() {
		assertArrayEquals(new int[][] {}, service.squarePatch(0));
	}

}
