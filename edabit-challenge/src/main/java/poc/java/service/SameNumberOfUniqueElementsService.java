package poc.java.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class SameNumberOfUniqueElementsService {

	public boolean same(int[] a1, int[] a2) {
		return Arrays.stream(a1).distinct().count() == Arrays.stream(a2).distinct().count();
	}
}
