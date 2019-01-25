package org.sravan.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.ehcache.event.EventType;

public class CacheEventLogger implements CacheEventListener<Integer, Integer> {

	Logger log = LogManager.getLogger(CacheEventLogger.class);

	@Override
	public void onEvent(CacheEvent<? extends Integer, ? extends Integer> cacheEvent) {

		if (cacheEvent.getType().equals(EventType.CREATED)) {
			log.info("Cache event CREATED for item with key {}. Old value = {}, New value = {}", cacheEvent.getKey(),
					cacheEvent.getOldValue(), cacheEvent.getNewValue());
		}
		if (cacheEvent.getType().equals(EventType.EXPIRED)) {
			log.info("Cache event EXPIRED for item with key {}. Old value = {}, New value = {}", cacheEvent.getKey(),
					cacheEvent.getOldValue(), cacheEvent.getNewValue());
		}
	}
}
