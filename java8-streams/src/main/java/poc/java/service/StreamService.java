package poc.java.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author ashishb888
 */

@Service
public class StreamService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void main() {
		logger.info("main service");

	}
}
