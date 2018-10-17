package com.chapter11.containner.iterator;

import java.util.ArrayList;
import java.util.List;

public class ForeachTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("kobe");
		list.add("james");
		list.add("wade");
		
		for(String str: list){
			System.out.println(str);
		}
	}

}
