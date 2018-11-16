package com.dp.interpreter;

class NotSpec implements Spec {
	Spec s;
	public NotSpec(final Spec s) {
		this.s = s;
	}
	@Override public boolean isSatisfiedBy(final Product p) {
		return !s.isSatisfiedBy(p);
	}
}
