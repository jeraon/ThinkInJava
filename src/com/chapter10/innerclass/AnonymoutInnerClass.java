package com.chapter10.innerclass;

/**
 * 匿名内部类
 */
public class AnonymoutInnerClass {

	public static void main(String[] args) {
		AnonymoutInnerClass aic = new AnonymoutInnerClass();
		Animal animal = aic.getAnimal("Dog");
		System.out.println(animal.getName());
		Contents c = aic.getContent();
		System.out.println(c.value());
	}
	
	public Animal getAnimal(String name){
		//表示创建一个继承自Animal的匿名类的对象
		return new Animal(name){
			//private String str = name;如果使得该句编译通过，则需要将参数name定义为final类型的
			public String getName(){
				return super.getName()+" is Animal";
			}
		};
	}
	public Contents getContent(){
		return new Contents(){
			private int i = 3;
			@Override
			public int value() {
				return i;
			}
		};
	}
	 class Animal{
		private String name;
		public Animal(String name){
			this.name = name;
		}
		public String getName(){
			return name;
		}
	}
}
