package com.chapter10.innerclass;

/**
 * 接口内部的类，自动为static final
 */
public interface ClassInInterface {
	void doSomething();
	
	class Test implements ClassInInterface{

		@Override
		public void doSomething() {
			System.out.println("doSomething");
		}
		
		public static void main(String args[]){
			new Test().doSomething();
		}
	}
}
