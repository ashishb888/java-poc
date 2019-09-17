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
public class JavaRxService {
	@Autowired
	private FlowableService fs;
	@Autowired
	private ObservableService os;
	@Autowired
	private SchedulersService ss;

	public void main() {
		log.info("main service");

		ss.main();
		// os.main();
		// fs.main();
	}
}
