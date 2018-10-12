package com.jyq.interfaces;

public class CycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cycle c2 = new BicycleFactory().getCycle();
		c2.go();
		c2 = new UnicycleFactory().getCycle();
		c2.go();
		c2 = new TricycleFactory().getCycle();
		c2.go();
	}
	/**
	 * Bicycle ..... Unicycle ..... Tricycle .....
	 */

}
