package com.dp.flyWeight;

class PointMutable {
	private int x, y;
	public PointMutable(final int x, final int y) {
		super();
		this.x = x;
		this.y = y;
	}
	int getX() {
		return x;
	}
	void setX(final int x) {
		this.x = x;
	}
	int getY() {
		return y;
	}
	void setY(final int y) {
		this.y = y;
	}
	void move(final int dx, final int dy) {
		x += dx;
		y += dy;
	}
	//hashCode and equals can be added
}
