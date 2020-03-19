package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.FindTheSecondOccurrenceOfZipInStringService;

@SpringBootTest
public class FindTheSecondOccurrenceOfZipInStringServiceTest {
	@Autowired
	private FindTheSecondOccurrenceOfZipInStringService service;

	@Test
	public void test1() {
		assertEquals(18, service.findZip("all zip files are zipped"));
	}

	@Test
	public void test2() {
		assertEquals(-1, service.findZip("all zip files are compressed"));
	}

}
