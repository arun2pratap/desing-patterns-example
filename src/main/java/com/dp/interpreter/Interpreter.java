package com.dp.interpreter;

import java.util.List;

public class Interpreter {
	private static void printAllProducts(final List<Product> ps) {
		int i = 0;
		for (Product p : ps)
			System.out.printf("%d %s%n", ++i, p);
	}

	public static void main(final String[] args) {
		ProductFinder pf = new ProductFinder();
		pf.all.add(new Product(10, 100, 3));
		pf.all.add(new Product(11, 500, 3));
		pf.all.add(new Product(12, 400, 3));
		//printAllProducts(pf.belowPriceAvoidingAColor(450, 12));
		printAllProducts(pf.selectBy(new AndSpec(new BelowPrice(450),
		        new NotSpec(new ColorSpec(12)))));
	}
}
