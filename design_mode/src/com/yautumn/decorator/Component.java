package com.yautumn.decorator;
/**
 * 抽象组件
 * @param decorator
 */
public abstract class Component extends Decorator {
	protected Decorator decorator;
	public Component() {
	}
	public Component(Decorator decorator) {
		this.decorator = decorator;
	}
}
