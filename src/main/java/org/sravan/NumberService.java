package org.sravan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

	Logger log = LogManager.getLogger(NumberService.class);

	@Cacheable(value = "squareCache", key = "#number", condition = "#number>5")
	public int square(int number) {
		final int square = Math.multiplyExact(number, number);
		log.info("square of {} is {} ", number, square);
		return square;
	}
}
