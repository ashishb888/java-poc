package poc.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.StateNamesAndAbbreviationsService;

@SpringBootTest
public class StateNamesAndAbbreviationsServiceTest {
	@Autowired
	private StateNamesAndAbbreviationsService snaas;

	@Test
	public void filterStateNames1() {
		assertArrayEquals(new String[] { "CA", "NY" },
				snaas.filterStateNames(new String[] { "Arizona", "CA", "NY", "Nevada" }, "abb"));
	}

	@Test
	public void filterStateNames2() {
		assertArrayEquals(new String[] { "Arizona", "Nevada" },
				snaas.filterStateNames(new String[] { "Arizona", "CA", "NY", "Nevada" }, "full"));
	}

	@Test
	public void filterStateNames3() {
		assertArrayEquals(new String[] { "MT", "NJ", "TX", "ID", "IL" },
				snaas.filterStateNames(new String[] { "MT", "NJ", "TX", "ID", "IL" }, "abb"));
	}

	@Test
	public void filterStateNames4() {
		assertArrayEquals(new String[] {},
				snaas.filterStateNames(new String[] { "MT", "NJ", "TX", "ID", "IL" }, "full"));
	}
}
