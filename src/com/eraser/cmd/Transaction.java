package com.eraser.cmd;

public class Transaction {

	Command command;

	

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void sellBuy() {
		command.execute();
	}
	
}
