package com.chapter10.innerclass.mutiextends;

public class Client implements Incrementable{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c = new Client();
		c.increment();

	}

	@Override
	public void increment() {
		// TODO Auto-generated method stub
		System.out.println("Incrementable.increment()...");
		new Inner().increment();
		
	}
	
	class Inner extends MyIncrement{
		@Override
		public void increment() {
			System.out.println("MyIncrement.increment()...");
		}
		
	}
}
/**
 * Incrementable.increment()...
 * MyIncrement.increment()...
 */
