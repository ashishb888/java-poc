package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.ValidHexCodeService;

@SpringBootTest
public class ValidHexCodeServiceTest {
	@Autowired
	private ValidHexCodeService service;

	@Test
	public void test1() {
		assertEquals(true, service.isValidHexCode("#CD5C5C"));
	}

	@Test
	public void test2() {
		assertEquals(true, service.isValidHexCode("#EAECEE"));
	}

	@Test
	public void test3() {
		assertEquals(true, service.isValidHexCode("#eaecee"));
	}

	@Test
	public void test4() {
		assertEquals(false, service.isValidHexCode("#CD5C58C"));
	}

	@Test
	public void test5() {
		assertEquals(false, service.isValidHexCode("#CD5C&C"));
	}

	@Test
	public void test6() {
		assertEquals(false, service.isValidHexCode("CD5C5C"));
	}

}
