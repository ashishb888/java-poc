package poc.java.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class PerfectSquarePatchService {

	public int[][] squarePatch(int n) {

		if (n == 0)
			return new int[][] {};

		int arr[][] = new int[n][n];

		for (int i = 0; i < n; i++)
			Arrays.fill(arr[i], n);

		return arr;
	}
}
