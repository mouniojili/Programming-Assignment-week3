package com.eraser.beans;

public class PenEraserFactory extends EraserAbstractFactory{


	@Override
	public Eraser createEraser(String type) {
		// TODO Auto-generated method stub
		Eraser eraser = null;
		if(type.equals("pen")) {
			eraser= new PenEraser();
		}
		return eraser;
	}

	
	
	
	
}
