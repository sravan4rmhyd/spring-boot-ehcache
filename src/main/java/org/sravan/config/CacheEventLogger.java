package org.sravan.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.sravan.NumberService;

public class CacheEventLogger implements CacheEventListener<Integer, Integer> {

	Logger log = LogManager.getLogger(NumberService.class);

	@Override
	public void onEvent(CacheEvent<? extends Integer, ? extends Integer> cacheEvent) {
		log.info("Cache event {} for item with key {}. Old value = {}, New value = {}", cacheEvent.getType(),
				cacheEvent.getKey(), cacheEvent.getOldValue(), cacheEvent.getNewValue());
	}
}
