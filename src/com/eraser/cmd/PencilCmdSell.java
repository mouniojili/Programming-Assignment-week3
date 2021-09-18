package com.eraser.cmd;

public class PencilCmdSell implements Command{

	PencilCmd penCmd;
	
	
	
	public PencilCmdSell(PencilCmd penCmd) {
		super();
		this.penCmd = penCmd;
	}



	@Override
	public void execute() {
		// TODO Auto-generated method stub
		penCmd.sellPencil();
	}

}
