package com.yautumn.observer;

import java.util.ArrayList;

/**
 * 具体主题
 * @author Administrator
 *
 */
public class SpecificSubject implements Subject {
	
	String message;
	boolean flag;
	ArrayList<Observer> obsList;
	
	SpecificSubject(){
		obsList = new ArrayList<Observer>();
		message = "";
		flag = false;
	}

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		if(!(obsList.contains(o))) {
			obsList.add(o);
		}

	}

	@Override
	public void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		if(obsList.contains(o)) {
			obsList.remove(o);
		}

	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		if(flag) {
			for(int i = 0; i < obsList.size(); i++) {
				Observer observer = obsList.get(i);
				observer.doSomething(message);
				flag = false;
			}
		}
	}
	public void giveNewMes(String str) {
		
		if(str.equals(message)) {
			flag = false;
		}else {
			message = str;
			flag = true;
		}
		
	}
}
