package com.jyq.interfaces;

public class TricycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Tricycle();
	}
}
