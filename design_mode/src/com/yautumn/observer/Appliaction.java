package com.yautumn.observer;

public class Appliaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecificSubject specificSubject = new SpecificSubject();
		new SpecificObserver(specificSubject, "A.txt");
		new SpecifiObserverSecond(specificSubject, "B.txt");
		specificSubject.giveNewMes("�ڻԹ�˾��Ҫ10��java����Ա��");
		specificSubject.notifyObserver();
		specificSubject.giveNewMes("������˾��Ҫ8���������ʦ��");
		specificSubject.notifyObserver();
		specificSubject.giveNewMes("�ʺ���˾��Ҫ9���繤��");
		specificSubject.notifyObserver();
		specificSubject.giveNewMes("�ʺ���˾��Ҫ9���繤��");
		specificSubject.notifyObserver();
	}

}
