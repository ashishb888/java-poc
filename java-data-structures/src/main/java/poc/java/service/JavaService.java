package poc.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JavaService {

	@Autowired
	private MyStackService mss;

	public void main() {
		log.debug("main service");

		mss.main();
	}
}
