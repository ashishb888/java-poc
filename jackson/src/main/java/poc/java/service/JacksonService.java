package poc.java.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ashishb888
 */

@Service
@SuppressWarnings("unused")
@Slf4j
public class JacksonService {

	@Autowired
	private JsonNodeService jns;

	public void main() {
		log.info("main service");

		jns.main();
	}
}
