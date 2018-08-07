package com.yautumn.decorator;

public class ConcreteDecorator extends Decorator {

	public final int DISTANCE = 100;
	@Override
	public int fly() {
		return DISTANCE;
	}

}
