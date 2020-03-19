package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.MusicalInstrumentNoteRangesService;

@SpringBootTest
public class MusicalInstrumentNoteRangesServiceTest {
	@Autowired
	private MusicalInstrumentNoteRangesService service;

	@Test
	public void test1() {
		assertEquals(false, service.instrumentRange("Piccolo", "A3"));
	}

	@Test
	public void test2() {
		assertEquals(true, service.instrumentRange("Violin", "G6"));
	}

	@Test
	public void test3() {
		assertEquals(true, service.instrumentRange("Piano", "C8"));
	}

}
