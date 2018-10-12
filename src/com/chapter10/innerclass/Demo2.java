package com.chapter10.innerclass;

public class Demo2 {

	public static void main(String[] args) {

		Parcel p = new Parcel();
		// 通过Parcel对象方法可以获取到Parcel中被private修饰的内部类，且向上转型为其基类，因此隐藏了实现的细节。
		Contents content = p.contents();
		Destination d = p.destination("Hello");
		// 由于Parcel.PContent被private修饰，因此即使构造方法为public，也无法通过该方式获取其实例。
		// Contents c = p.new PContent();
	}
}
