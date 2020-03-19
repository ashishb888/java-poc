package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.CaptureTheRookService;

@SpringBootTest
public class CaptureTheRookServiceTest {
	@Autowired
	private CaptureTheRookService service;

	@Test
	public void test1() {
		assertEquals(true, service.canCapture(new String[] { "A8", "E8" }));
	}

	@Test
	public void test2() {
		assertEquals(false, service.canCapture(new String[] { "A1", "B2" }));
	}

	@Test
	public void test3() {
		assertEquals(true, service.canCapture(new String[] { "H4", "H3" }));
	}

	@Test
	public void test4() {
		assertEquals(false, service.canCapture(new String[] { "F5", "C8" }));
	}
}
