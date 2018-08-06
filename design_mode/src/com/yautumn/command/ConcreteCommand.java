package com.yautumn.command;

/**
 * ����ģʽ�����������
 * @author Administrator
 *
 */
public class ConcreteCommand implements Command {
	
	Receiver receiver;
	
	ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.executeCommand();
	}

}
