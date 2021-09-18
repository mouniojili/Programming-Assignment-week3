package com.eraser.cmd;

public class PenCmdSell implements Command {

	PenCmd cmd;

	public PenCmdSell(PenCmd cmd) {
		super();
		this.cmd = cmd;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		cmd.sellPen();
	}
	
	
	
	
}
