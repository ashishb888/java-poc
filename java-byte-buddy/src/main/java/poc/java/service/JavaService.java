package poc.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ashishb888
 */

@Slf4j
@Service
public class JavaService {

	@Autowired
	private ByteBuddyService bbs;

	public void main() {
		log.debug("main service");

		bbs.main();
	}
}
