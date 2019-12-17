package poc.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ashishb888
 */

@Service
@Slf4j
@SuppressWarnings("unused")
public class JavaService {

	@Autowired
	private ReflectionService rs;

	public void main() {
		log.debug("main service");

		rs.main();
	}
}
