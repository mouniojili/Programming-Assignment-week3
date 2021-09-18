package com.eraser.cmd;

public class PenCmdBuy implements Command {

	PenCmd cmd;

	
	public PenCmdBuy(PenCmd cmd) {
		super();
		this.cmd = cmd;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		cmd.BuyPen();;
	}
	
	
	
	
}
