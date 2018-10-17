package com.chapter11.containner;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map = new HashMap<Integer,String>();
		Map<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(1,"map2value1");
		map2.put(2, "map2value2");

		map.putAll(map2);
		String str = map.get(1);
		boolean isContainKey = map.containsKey(3);
		boolean isContainValue = map.containsValue("kobe");
		boolean isEmpty = map.isEmpty();
		map.replace(1, "kobe");
		map.replace(1, "kobe", "kobenew");
		
		Set<Integer> set = map.keySet();
		Collection<String> values = map.values();
		Set<Entry<Integer, String>> sset = map.entrySet();
		for(Map.Entry<Integer, String> en:sset){
			int key = en.getKey();
			String value = en.getValue();
		}
		
		map.remove(1);
		map.remove(2, "map2value2");
		System.out.println(map);
		System.out.println(str);
		int size = map.size();
		map.clear();
	}
}
