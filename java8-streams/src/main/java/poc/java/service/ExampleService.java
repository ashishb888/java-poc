package poc.java.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import poc.java.domain.Employee;
import poc.java.repos.StreamsRepository;
import poc.java.repos.StringRepository;

@Service
@Slf4j
@SuppressWarnings(value = "unused")
public class ExampleService {

	private long repeatedStringOld(String s, long n) {
		log.info("repeatedString service");

		String rs = "";
		int len = s.length();

//		if (len == 1) {
//			
//			if
//			return n;
//		}

		long div = n / len;
		log.info("div: " + div);

		long charCount = s.chars().filter(e -> (char) e == 'a').count();

		log.info("charCount: " + charCount);

		// div = div / len;
		// log.info("div: " + div);
		long mod = n % len;
		log.info("mod: " + mod);

		// for (int i = 1; i < div; i++) {
		// rs += s;
		// }

		log.info("rs: " + rs);

		if (mod > 0) {
			rs += s.substring(0, Long.valueOf(mod).intValue());
		}

		log.info("rs: " + rs);

		long count = rs.chars().filter(e -> (char) e == 'a').count();
		long fCount = charCount * div + count;

		log.info("count: " + count);
		log.info("fCount: " + fCount);

		return fCount;
	}

	private long repeatedString(String s, long n) {
		log.info("repeatedString service");

		String rs = "";
		int len = s.length();

		long div = n / len;
		log.info("div: " + div);

		long initialCount = s.chars().filter(e -> (char) e == 'a').count();

		log.info("initialCount: " + initialCount);

		long mod = n % len;
		log.info("mod: " + mod);

		log.info("rs: " + rs);

		if (mod > 0) {
			rs += s.substring(0, Long.valueOf(mod).intValue());
		}

		log.info("rs: " + rs);

		long ramainingCount = rs.chars().filter(e -> (char) e == 'a').count();
		long finalCount = initialCount * div + ramainingCount;

		log.info("finalCount: " + finalCount);

		return finalCount;
	}

	private void examples() {
		log.info("examples service");
		repeatedString("aba", 10);
		// repeatedString("a", 1000000000000L);
		repeatedString("aab", 882787);
		// aab
		// 882787
		// 588525
		// x
		// 882787
	}

	public void main() {
		log.info("main service");

		examples();
	}

}
