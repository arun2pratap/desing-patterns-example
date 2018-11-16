package com.dp.interpreter;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ProductFinder {
	List<Product> all = new LinkedList<Product>();
	List<Product> belowPriceAvoidingAColor(final int price,
	        final int color) {
		List<Product> r = new LinkedList<Product>();
		for (Product p : all)
			if ((p.price < price) && (p.color != color))
				r.add(p);
		return Collections.unmodifiableList(r);
	}
	List<Product> selectBy(final Spec s) {
		List<Product> r = new LinkedList<Product>();
		for (Product p : all)
			if (s.isSatisfiedBy(p))
				r.add(p);
		return Collections.unmodifiableList(r);
	}
}
