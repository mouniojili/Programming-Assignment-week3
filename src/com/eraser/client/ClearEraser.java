package com.eraser.client;

import com.eraser.beans.Eraser;
import com.eraser.beans.EraserAbstractFactory;
import com.eraser.beans.PenEraserFactory;
import com.eraser.beans.PencilEraserFactory;
import com.eraser.cmd.PenCmd;
import com.eraser.cmd.PenCmdBuy;
import com.eraser.cmd.PenCmdSell;
import com.eraser.cmd.PencilCmd;
import com.eraser.cmd.PencilCmdBuy;
import com.eraser.cmd.PencilCmdSell;
import com.eraser.cmd.Transaction;

public class ClearEraser {

	
	public static void main(String[] args) {
		
		EraserAbstractFactory pencilEraser = new PencilEraserFactory();
		EraserAbstractFactory penEraser = new PenEraserFactory();
		Eraser clearErrorWithPen = penEraser.erase("pen");
		Eraser clearErrorWithPencil = pencilEraser.erase("pencil");
		
		System.out.println();
		System.out.println("**********Command pattern to buy/sell eraser************");
		//Command pattern to buy/sell eraser
		Transaction transaction = new Transaction();
		PencilCmd pencilCmd = new PencilCmd();
		PenCmd penCmd = new PenCmd();
		
		transaction.setCommand(new PencilCmdBuy(pencilCmd));
		transaction.sellBuy();
		
		transaction.setCommand(new PencilCmdSell(pencilCmd));
		transaction.sellBuy();
		
		transaction.setCommand(new PenCmdBuy(penCmd));
		transaction.sellBuy();
		
		transaction.setCommand(new PenCmdSell(penCmd));
		transaction.sellBuy();
		
		
	}
}
