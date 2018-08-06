package com.yautumn.observer;

public class Appliaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecificSubject specificSubject = new SpecificSubject();
		new SpecificObserver(specificSubject, "A.txt");
		new SpecifiObserverSecond(specificSubject, "B.txt");
		specificSubject.giveNewMes("腾辉公司需要10个java程序员。");
		specificSubject.notifyObserver();
		specificSubject.giveNewMes("海景公司需要8个动画设计师。");
		specificSubject.notifyObserver();
		specificSubject.giveNewMes("仁海公司需要9个电工。");
		specificSubject.notifyObserver();
		specificSubject.giveNewMes("仁海公司需要9个电工。");
		specificSubject.notifyObserver();
	}

}
