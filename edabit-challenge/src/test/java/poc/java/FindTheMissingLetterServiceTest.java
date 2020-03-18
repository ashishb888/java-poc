package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.SameNumberOfUniqueElementsService;

@SpringBootTest
public class FindTheMissingLetterServiceTest {

	@Autowired
	private SameNumberOfUniqueElementsService snoues;

	@Test
	public void same1() {
		assertEquals(true, snoues.same(new int[] {}, new int[] {}));
	}

	@Test
	public void same2() {
		assertEquals(true, snoues.same(new int[] { 1, 2, 3 }, new int[] { 3, 2, 1 }));
	}

	@Test
	public void same3() {
		assertEquals(true, snoues.same(new int[] { 1, 1, 2, 2 }, new int[] { 2, 2, 1, 1, }));
	}

	@Test
	public void same4() {
		assertEquals(false, snoues.same(new int[] { 1, 1, 2, 2, 3 }, new int[] { 2, 2, 1, 1, }));
	}
}
