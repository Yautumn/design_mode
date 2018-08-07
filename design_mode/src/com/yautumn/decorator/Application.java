package com.yautumn.decorator;

public class Application {

	public void needDecorator(Decorator decorator) {
		int flyDistance = decorator.fly();
		System.out.println(flyDistance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Application client = new Application();
		Decorator component = new ConcreteDecorator();
		Decorator componentDecorator1 = new ConcreteComponent(component);
		Decorator componentDecorator2 = new ConcreteComponent(componentDecorator1);
		client.needDecorator(componentDecorator1);
		client.needDecorator(componentDecorator2);
	}

}
