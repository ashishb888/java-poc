package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@SuppressWarnings("unused")
public class JsonNodeService {

	private void csvToJson() {
		log.info("csvToJson serive");
	}

	public void main() {
		log.info("main service");

		csvToJson();
	}
}
