package com.chapter10.innerclass;

public class Parcel {

	//PContent作为Parcel的外部类，被private修饰
	private class PContent implements Contents{
		@Override
		public int value() {
			return 0;
		}	
	}
	//PContent作为Parcel的外部类，被private修饰
	protected class PDestination implements Destination{
		private String lable;
		@Override
		public String readLabel() {
			return "PDestination";
		}
		private PDestination(String s){
			lable = s;
		}
	}
	//在其他类中将通过Parcel对象调用该方法获取PDestination实例
	public Destination destination(String s) {
		return new PDestination(s);
	}
	//在其他类中将通过Parcel对象调用该方法获取PContent实例
	public Contents contents(){
		return new PContent();
	}
}
