package com.eraser.cmd;

public class PencilCmdBuy implements Command{

	PencilCmd cmd;

	public PencilCmdBuy(PencilCmd cmd) {
		super();
		this.cmd = cmd;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		cmd.BuyPencil();
	}
	
	
	
	
}
