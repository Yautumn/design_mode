package com.yautumn.decorator;

/**
 * 装饰实现类
 * @author Administrator
 *
 */
public class ConcreteDecorator extends Decorator {

	public final int DISTANCE = 100;
	@Override
	public int fly() {
		return DISTANCE;
	}

}
