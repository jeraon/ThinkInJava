package com.chapter10.innerclass;

/**
 * 多级嵌套类
 */
public class MutiNestingAccess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.h();
	}
	
	static class A {
		private void f(){
		}
		class B{
			private void g(){}
			class C{
				void h(){
					f();
					g();
				}
			}
		} 
	}
}
