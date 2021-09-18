package com.eraser.beans;

public class PencilEraserFactory  extends EraserAbstractFactory{

	@Override
	public Eraser createEraser(String type) {
		// TODO Auto-generated method stub
		Eraser eraser = null;
		if(type.equals("pencil")) {
			eraser= new PencilEraser();
		}
		return eraser;
	}

}
