package com.dp.flyWeight.cache;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class FlyweightCacheApp {
	public static void main(String[] args) {
		LruCache<LocalDate> myDateCache = new LruCache<>(5);
		for (int i = 1; i <= 30; ++i)
			myDateCache.addIfNotPresentAndReturnFromCache(LocalDate.of(2015, 1,	i));
		System.out.println(myDateCache);
		LocalDate a = LocalDate.of(2015, 2, 1);
		LocalDate b = LocalDate.of(2015, 2, 1);
		System.out.printf("Two different date objects created for the same date? %b%n",	(a != b));
		a = myDateCache.addIfNotPresentAndReturnFromCache(a);
		b = myDateCache.addIfNotPresentAndReturnFromCache(b);
		System.out.printf("Second date replaced with existing item from cache? %b%n", (a == b));
	}
}
