package com.chapter10.innerclass.inherit;

public class InheritInner extends WithInner.Inner{

	public InheritInner(WithInner wi){
		wi.super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}
}
