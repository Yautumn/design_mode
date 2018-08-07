package com.yautumn.observer;

/**
 * 主题接口
 * @author Administrator
 *
 */
public interface Subject {
	
	public void addObserver(Observer o);
	
	public void deleteObserver(Observer o);
	
	public void notifyObserver();

}
