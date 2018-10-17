package com.chapter10.innerclass;

/**
 * 静态内部类测试
 */
public class StaticInnerClass {

	public static void main(String[] args) {
		//嵌套内部类
		ParcelContents p = new ParcelContents();
		ParcelDestination d = new ParcelDestination("lable");	
		//普通内部类
		ParcelContents2 p2 = new StaticInnerClass().new ParcelContents2();
	}
	
	//嵌套类
	private static class ParcelContents implements Contents{
		@Override
		public int value() {
			return 0;
		}
	}
	
	private class ParcelContents2 implements Contents{
		@Override
		public int value() {
			return 0;
		}
	}

	//嵌套类
	protected static class ParcelDestination implements Destination {

		private String label;
		private ParcelDestination(String label) {
			this.label = label;
		}
		@Override
		public String readLabel() {
			return label;
		}
		static int x = 10;
		//嵌套类
		static class AnotherLevel {
			public static void f(){}
			static int x = 10;
		}
	}
}
