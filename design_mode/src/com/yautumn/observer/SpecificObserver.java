package com.yautumn.observer;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SpecificObserver implements Observer {
	
	Subject subject;
	File myFile;
	SpecificObserver(Subject subject,String fileName){
		this.subject = subject;
		subject.addObserver(this);
		myFile = new File(fileName);
	}

	@SuppressWarnings("resource")
	@Override
	public void doSomething(String something) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile out = new RandomAccessFile(myFile, "rw");
			out.seek(out.length());
			byte [] b = something.getBytes();
			out.write(b);
			System.out.println("�����ļ�" + myFile.getName()+ "д������" + something);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}