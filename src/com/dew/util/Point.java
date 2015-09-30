package com.dew.util;

public class Point extends AbstractPoint {
	protected int x = 0, y = 0;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	public Point setX(int x) {
		this.x = x;
		return this;
	}

	public Point setY(int x) {
		this.x = x;
		return this;
	}
}
