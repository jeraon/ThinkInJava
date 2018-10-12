package com.jyq.interfaces;

public class A {

	interface B{
		void f();
	}
	
	public class BImpl implements B{

		@Override
		public void f() {
			// TODO Auto-generated method stub
		}
		
	}
	public interface C{
		void f();
	}
	
	class CImpl implements C{

		@Override
		public void f() {
		}
		
	}
	
	private class CImpl2 implements C{
		@Override
		public void f() {
		}
	}
	/**
	 * private类型的接口
	 */
	private interface D{
		void f();
	}
	
	private class DImpl implements D{
		@Override
		public void f() {
		}
	}
	public class DImpl2 implements D{
		@Override
		public void f() {
		}
	}
	/**
	 * 返回private类型接口引用的public方法
	 * @return
	 */
	public D getD(){
		return new DImpl();
	}
	private D dRef;
	
	public void receiveD(D d){
		dRef = d;
		dRef.f();
	}
}
