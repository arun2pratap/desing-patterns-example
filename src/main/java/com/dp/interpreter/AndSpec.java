package com.dp.interpreter;

class AndSpec implements Spec {
	Spec s1, s2;
	public AndSpec(final Spec s1, final Spec s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override public boolean isSatisfiedBy(final Product p) {
		return s1.isSatisfiedBy(p) && s2.isSatisfiedBy(p);
	}
}
