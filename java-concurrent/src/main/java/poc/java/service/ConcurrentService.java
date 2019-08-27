package poc.java.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ashishb888
 */

@Service
public class ConcurrentService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CountDownLatchService cdLatchService;
	@Autowired
	private CyclicBarrierService cyclicBarrierService;
	@Autowired
	private ThreadService threadService;

	public void main() {
		logger.info("main service");

		// cdLatchService.main();
		// cyclicBarrierService.main();
		threadService.main();
	}
}
