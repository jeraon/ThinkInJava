package com.chapter11.containner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Array.asList()和Collection.addAll()使用
 */
public class AddingGroups {


	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>();
		Integer[] moreInts = {1,2,3,4,5,6,7};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, moreInts);
		List<Integer> list = Arrays.asList(moreInts);
		//Arrays.asList得到的List，其底层是数组，因此不能调整大小，调用add()会报错。
		//list.add(4);
	}
}
