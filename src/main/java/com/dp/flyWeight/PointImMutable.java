package com.dp.flyWeight;

class PointImMutable {
	private final int x, y;
	public PointImMutable(final int x, final int y) {
		super();
		this.x = x;
		this.y = y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	PointImMutable move(final int dx, final int dy) {
		return new PointImMutable(x + dx, y + dy);
	}
	//hashCode and equals can be added
}
