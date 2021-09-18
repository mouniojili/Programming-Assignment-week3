package com.eraser.beans;

public abstract class EraserAbstractFactory {

	public abstract Eraser createEraser(String type);
	
	public Eraser erase(String type) {
		Eraser eraser = createEraser(type);
		eraser.clearMistake();
		return eraser;
	}
	
}
