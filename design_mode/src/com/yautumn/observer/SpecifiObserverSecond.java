package com.yautumn.observer;

import java.io.File;
import java.io.RandomAccessFile;

public class SpecifiObserverSecond implements Observer {

	Subject subject;
	File myFile;

	SpecifiObserverSecond(Subject subject, String fileName) {
		this.subject = subject;
		subject.addObserver(this);
		myFile = new File(fileName);
	}

	@SuppressWarnings("resource")
	@Override
	public void doSomething(String something) {
		// TODO Auto-generated method stub
		try {
			boolean boo = something.contains("java") || something.contains("软件");
			if (boo) {
				RandomAccessFile out = new RandomAccessFile(myFile, "rw");
				out.seek(out.length());
				byte[] b = something.getBytes();
				out.write(b);
			} else {
				System.out.println("没有信息");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
