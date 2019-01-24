package org.sravan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

	Logger log = LogManager.getLogger(NumberController.class);

	@Autowired
	private NumberService numberService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/square/{number}")
	public String getSquare(@PathVariable int number) {
		log.info("call numberService to square {}", number);
		return String.format("{\"square\": %s}", numberService.square(number));
	}

}
