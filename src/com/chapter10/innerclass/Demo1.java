package com.chapter10.innerclass;

/**
 * 定义在方法中的局部内部类测试
 */
public class Demo1 {

	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		Destination ds = d.destination("Hello");
		ds.readLabel();
	}
	//在destination()方法内定义了PDestination类，但不意味着该方法执行完毕后，PDestination就不可用
	public Destination destination(String s) {
		//PDestination位于destination(String s)方法体中，因此对外部不可见
		class PDestination implements Destination{
			private String label;
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				System.out.println(label);
				return label;
			}
			private PDestination(String s){
				label = s;
			}
		}
		//返回PDestination实例，但返回值为Destination，进行了向上转型
		return new PDestination(s);
	}
}
