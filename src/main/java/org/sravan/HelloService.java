package org.sravan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	Logger log = LogManager.getLogger(HelloService.class);

	@Cacheable(value = "nameCache", key = "#name", condition = "#name.length()>3")
	public Hello getMessage(String name) {
		final String message = "Hello " + name;
		log.info("message from service for {} is {} ", name, message);
		final Hello hello = new Hello();
		hello.setName(name);
		hello.setFormattedName(message);
		return hello;
	}
}
