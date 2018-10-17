package com.chapter10.innerclass;

/**
 * 匿名内部类用途
 */
public class AnonymoutInnerClass2 {

	public static void main(String[] args) {
		AnonymoutInnerClass2 aic2 = new AnonymoutInnerClass2();
		//创建了一个实现了Listener接口的匿名类
		aic2.setListener(new Listener(){
			@Override
			public void onChange() {
				System.out.println("onChange...");
			}});
	}
	
	//参数为一个接口类型的对象
	public void setListener(Listener l){
		l.onChange();
	}
	
	//定义一个接口
	interface Listener{
		void onChange();
	}
}
