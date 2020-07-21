package poc.java.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BigDecimalService {

	private void bigDecimal() {
		log.debug("bigDecimal service");

		double d1 = 4.73;
		double d2 = 4.02;

		log.debug("d1: " + new BigDecimal(d1));
		log.debug("d2: " + new BigDecimal(d2));

		log.debug("d1: " + new BigDecimal(String.valueOf(d1)));
		log.debug("d2: " + new BigDecimal(String.valueOf(d2)));

		// d1: 4.730000000000000426325641456060111522674560546875
		// d2: 4.019999999999999573674358543939888477325439453125
		// d1: 4.73
		// d2: 4.02

	}

	public void main() {
		log.debug("main service");

		bigDecimal();
	}

}
