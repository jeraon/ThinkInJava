package com.chapter10.innerclass;

/**
 * 定义在代码块中的局部内部类
 */
public class Demo3 {

	public static void main(String[] args) {
		Demo3 demo3 = new Demo3();
		demo3.test(true);
	}
	
	private void test(boolean b){
		if (b){
			//定义在代码块中的局部内部类,并不是该类的创建是有条件的，而是在if()之外，它是不可用的
			class LocalInnerClass{
				private String id;
				LocalInnerClass(String id){
					this.id = id;
				}
				String getId(){
					System.out.println("id:"+id);
					return id;
				}
			}
			LocalInnerClass lic = new LocalInnerClass("no.1");
			lic.getId();
		}
	}
}
