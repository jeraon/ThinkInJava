package com.jyq.interfaces;

public class Client {

	public class BImp implements A.B{
		@Override
		public void f() {}
	}
	
	class CImp implements A.C{
		@Override
		public void f() {}
	}
	//无访问权限
	//! class DImp implements A.D{}
	class EImp implements E {
		@Override
		public void g() {}
	}
	
	class GImp implements E.G{
		@Override
		public void f() {}
	}
	
	class HImp implements E.H{
		@Override
		public void f() {
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		//！ D d = a.getD();D被声明为private，不能获取到实例
		//！ a.getD().f();同上
		//！ DImpl2 d2 = a.getD();getD()返回D类型
		a.receiveD(a.getD());//只有这种方法OK
	}

}
