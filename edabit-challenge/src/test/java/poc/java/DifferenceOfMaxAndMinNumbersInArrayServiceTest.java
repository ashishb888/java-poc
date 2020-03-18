package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.DifferenceOfMaxAndMinNumbersInArrayService;

@SpringBootTest
public class DifferenceOfMaxAndMinNumbersInArrayServiceTest {
	@Autowired
	private DifferenceOfMaxAndMinNumbersInArrayService service;

	@Test
	public void test1() {
		assertEquals(82, service.differenceMaxMin(new int[] { 10, 4, 1, 4, -10, -50, 32, 21 }));
	}

	@Test
	public void test2() {
		assertEquals(67, service.differenceMaxMin(new int[] { 44, 32, 86, 19 }));
	}
}
