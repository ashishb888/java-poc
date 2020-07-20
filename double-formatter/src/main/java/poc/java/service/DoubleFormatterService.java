package poc.java.service;

import java.text.DecimalFormat;

import org.apache.commons.math3.util.Precision;
import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DoubleFormatterService {

	double d1 = 1234.5678;
	double d2 = 1234;

	private void decimalFormat() {
		log.debug("decimalFormat service");

		DecimalFormat df = new DecimalFormat("#.00");
		log.debug(df.format(d1));
		log.debug(df.format(d2));
	}

	private void commonsMath() {
		log.debug("commonsMath service");

		log.debug("Precision#round: " + Precision.round(d1, 2));
		log.debug("Precision#round: " + Precision.round(d2, 2));
	}

	private void decimal4j() {
		log.debug("decimal4j service");

		log.debug("DoubleRounder#round: " + DoubleRounder.round(d1, 2));
		log.debug("DoubleRounder#round: " + DoubleRounder.round(d2, 2));
	}

	public void main() {
		log.debug("main service");

		decimalFormat();
		commonsMath();
		decimal4j();
	}

}
