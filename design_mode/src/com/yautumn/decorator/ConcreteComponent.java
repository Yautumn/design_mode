package com.yautumn.decorator;

public class ConcreteComponent extends Component {

	public final int DISTANCE = 50;
	
	ConcreteComponent(Decorator decorator){
		super(decorator);
	}
	
	public int fly() {
		int distance = 0;
		distance = decorator.fly() + eleFly();
		return distance;
	}
	
	private int eleFly() {
		return DISTANCE;
	}

}
