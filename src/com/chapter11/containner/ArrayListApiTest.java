package com.chapter11.containner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListApiTest {
	/**
	 * ArrayListAPI 测试
	 */
	public static void main(String[] args) {

		String[] arr = {"dog","rat","cat","pig","cow","dunk","sheep"};
		List<String> list = new ArrayList();
		list.add("kobe");
		list.add(0,"james");
		list.addAll(Arrays.asList(arr));
		list.addAll(0,Arrays.asList(arr));
		String str = list.get(4);
		boolean isContain = list.contains("pig");
		int index = list.indexOf("pig");
		index = list.lastIndexOf("pig");
		boolean isEmpty = list.isEmpty();
		list.remove(2);
		list.remove("pig");
		list.set(2, "new");
		Object[] arr2 = list.toArray();
		String[] arr3 = list.toArray(arr);
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()){
//			str = iterator.next();
//			System.out.println(str);
//		}
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()){
			str = listIterator.next();
			System.out.println(str);
		}
		
		while(listIterator.hasPrevious()){
			str = listIterator.previous();
			System.out.println(str);
		}
		//list.clear();
	}
}
