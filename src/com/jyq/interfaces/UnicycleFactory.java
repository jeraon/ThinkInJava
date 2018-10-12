package com.jyq.interfaces;

public class UnicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}

}
