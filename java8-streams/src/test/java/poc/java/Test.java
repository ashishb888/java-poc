package poc.java;

import java.awt.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Long> map = Arrays.stream(ar).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return map.values().stream().mapToInt(Long::intValue).map(e -> e / 2).sum();
	}

	static int countingValleys(int n, String s) {
//		s.chars().map(e-> (char)e).reduce(level, (e))
		return 0;
	}

	public static int shortestSubstring(String s) {

		String shortest = s.chars().distinct()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		System.out.println("shortest: " + shortest);

		int uChars = shortest.length();

		if (s.contains(shortest)) {
			return uChars;
		}

		int start = s.indexOf(shortest.charAt(0));
		System.out.println("start: " + start);

		int end = s.indexOf(shortest.charAt(shortest.length() - 1));
		System.out.println("end: " + end);

		return end - start;
	}

	static void removeDuplicates(char[] S) {
		int n = S.length;

		// We don't need to do anything for
		// empty or single character string.
		if (n < 2) {
			return;
		}

		// j is used to store index is result
		// string (or index of current distinct
		// character)
		int j = 0;

		// Traversing string
		for (int i = 1; i < n; i++) {
			// If current character S[i]
			// is different from S[j]
			if (S[j] != S[i]) {
				j++;
				S[j] = S[i];
			}
		}

		System.out.println(Arrays.copyOfRange(S, 0, j + 1));
	}

	public static void compressWord(String word, int k) {

		int i = 0;
		char[] chars = word.toCharArray();
		char f = chars[0];

		char r;
		boolean finish = false;
		while (!finish) {

			for (int j = 1; j < chars.length; j++) {

				if (f == chars[j]) {
					i++;

					if (i == k) {
						r = chars[j];
					}
				}
			}
		}

	}
	
	private void m1(Connection connection) {
		java.util.List<String> adminClient;
		try {
            final Map<String, String> dataMap = new HashMap<>();

            dataMap.entrySet().forEach(entry -> {
                // Need to use connection object here ...
                // Unable to use the connection if it is not final and to make it final, not initializing it to null  ...
            });

        }
        catch (final Exception e) {
            e.printStackTrace();
        }
        finally {
            if (connection != null) {
                try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }
	}

	public static void main(String[] args) {
//		int pairs = sockMerchant(9, new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 });
//		System.out.println("pairs: " + pairs);

		// int size = shortestSubstring("bab");
		// int size = shortestSubstring("dabbcabcd");
//		smallesteSubstr_maxDistictChar("aabcce");
//		int size = shortestSubstring("aabcce");
//		System.out.println("size: " + size);

		removeDuplicates("abbcccb".toCharArray());
		// compressWord("aba", 2);

	}
}
