package poc.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

/**
 * @author ashishb888
 */

@Service
@Log
public class OopService {
	@Autowired
	private InheritanceService inheritanceService;

	public void main() {
		log.info(this.getClass().getName() + ": main service");

		inheritanceService.main();
	}
}
