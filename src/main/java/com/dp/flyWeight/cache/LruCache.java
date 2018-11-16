package com.dp.flyWeight.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/* We want to cache immutable objects.
   Create a LRU cache for immutable objects
   Hint: Use removeEldestEntry function in LinkedHashMap
*/
class LruCache<E> {
	private final int maxEntries;
	private final Map<E, E> cache = new LruCacheMap<>();

	public LruCache(int capacity) {
		maxEntries = capacity;
	}

	class LruCacheMap<A, B> extends LinkedHashMap<A, B> {
		public LruCacheMap() {
			super(maxEntries + 1, 1.1f, true);
		}

		@Override
		protected boolean removeEldestEntry(Map.Entry<A, B> eldest) {
			return super.size() > maxEntries;
		}
	}

	public synchronized E addIfNotPresentAndReturnFromCache(E object) {
		if (cache.containsKey(object))
			return cache.get(object);
		cache.put(object, object);
		return object;
	}

	@Override
	public String toString() {
		return "Cache contains " + cache;
	}
}
