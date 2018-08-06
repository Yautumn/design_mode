package com.yautumn.command;

import org.junit.Test;

public class Requester {
	
	Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void startExecuteCommand() {
		command.execute();
	}
	
	@Test
	public void testCommand() {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Requester requester = new Requester();
		requester.setCommand(command);
		requester.startExecuteCommand();
	}

}
