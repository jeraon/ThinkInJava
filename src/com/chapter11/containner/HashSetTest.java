package com.chapter11.containner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

//HashSet测试

public class HashSetTest {

	public static void main(String[] args) {

		String[] arr = {"kobe","james","jordan","wade"};
		HashSet<String> hashSet = new HashSet();
		hashSet.addAll(Arrays.asList(arr));
		hashSet.add("kobe");//不可重複存儲元素
		
		boolean isContain = hashSet.contains("kobe");
		boolean isEmpty = hashSet.isEmpty();
		int size = hashSet.size();
		hashSet.remove("kobe");
		Iterator<String> it = hashSet.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		System.out.println(hashSet);
		hashSet.clear();
	}
}
