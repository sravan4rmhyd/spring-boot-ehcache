package org.sravan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	Logger log = LogManager.getLogger(HelloController.class);

	@Autowired
	private HelloService helloService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/hello/{name}")
	public Hello getSquare(@PathVariable String name) {
		log.info("call helloService with name {}", name);
		return helloService.getMessage(name);
	}

}
