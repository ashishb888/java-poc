package poc.java.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import poc.java.domain.TestDomain;

/**
 * @author ashishb888
 */

@Service
@Slf4j
public class JavaAdhocService {

	private Map<Integer, TestDomain> map = new HashMap<>();

	private void start() throws Exception {
		log.debug("start service");

		TestDomain td1 = new TestDomain();
		TestDomain td2 = new TestDomain();

		td1 = map.get(1);
		td2 = map.get(1);

		log.debug("td1: " + td1);
		log.debug("td2: " + td2);

		td2.setI1(2);
		td2.setI2(2);

		log.debug("After setters");
		log.debug("td1: " + td1);
		log.debug("td2: " + td2);
	}

	private void init() {

		for (int i = 0; i < 10; i++) {
			map.put(i, new TestDomain(String.valueOf(i), String.valueOf(i), i, i));
		}
	}

	public void main() {
		log.debug("main service");

		try {
			init();
			start();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}
}
