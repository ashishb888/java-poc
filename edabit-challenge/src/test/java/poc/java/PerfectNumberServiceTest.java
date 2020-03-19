package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.PerfectNumberService;

@SpringBootTest
public class PerfectNumberServiceTest {
	@Autowired
	private PerfectNumberService service;

	@Test
	public void test1() {
		assertEquals(true, service.checkPerfect(6));
	}

	@Test
	public void test2() {
		assertEquals(true, service.checkPerfect(28));
	}

	@Test
	public void test3() {
		assertEquals(true, service.checkPerfect(496));
	}

	@Test
	public void test4() {
		assertEquals(false, service.checkPerfect(12));
	}

	@Test
	public void test5() {
		assertEquals(false, service.checkPerfect(97));
	}
}
