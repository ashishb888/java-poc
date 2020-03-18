package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.CompoundingLettersService;

@SpringBootTest
public class CompoundingLettersServiceTest {
	@Autowired
	private CompoundingLettersService cls;

	@Test
	public void test1() {
		assertEquals("A-Bb-Ccc-Dddd", cls.accum("abcd"));
	}

	@Test
	public void test2() {
		assertEquals("R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy", cls.accum("RqaEzty"));
	}

	@Test
	public void test3() {
		assertEquals("C-Ww-Aaa-Tttt", cls.accum("cwAt"));
	}
}
