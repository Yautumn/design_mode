package com.yautumn.command;

/**
 * 命令模式命令具体命令
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
