package com.chapter10.innerclass;

//外围类
public class Outer {

	private String name = "Outer";

	/**
	 * 在外围类中，可以直接使用new生成一个内部类的引用
	 */
	Inner getInner() {
		return new Inner();
	}
	// 内部类
	class Inner {

		void innerF() {
			System.out.println("innerF()...");
		}

		/**
		 * 在内部类中，通过.this获取生成一个外围类的引用
		 */
		Outer outer() {
			return Outer.this;
		}
	}

	void outerF() {
		System.out.println("OuterF()...");
	}
}
