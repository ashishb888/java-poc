package poc.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

/**
 * @author ashishb888
 */

@Service
@Log
public class DesignPatternService {

	@Autowired
	private BuilderService builderService;
	@Autowired
	private SingletonService singletonService;
	@Autowired
	private PrototypeService prototypeService;

	public void main() {
		log.info("main service starts");

		// builderService.main();
		// singletonService.main();
		prototypeService.main();

		log.info("main service ends");
	}
}
