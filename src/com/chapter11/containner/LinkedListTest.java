package com.chapter11.containner;

import java.util.LinkedList;

//LinkedList测试
public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList();
		String str1 = linkedList.peek();//null
		str1 = linkedList.peekFirst();//null
		linkedList.offer("kobe");
		linkedList.offerLast("curry");
		linkedList.offerFirst("james");
		str1 = linkedList.peek();
		str1 = linkedList.peekFirst();
		str1 = linkedList.peekLast();
		
		str1 = linkedList.poll();
		str1 = linkedList.pollFirst();
		str1 = linkedList.pollLast();
		
		linkedList.push("kobe");
		str1 = linkedList.element();
		str1 = linkedList.pop();
		
		linkedList.addFirst("jordan");
		linkedList.addLast("iverson");
		str1 = linkedList.getFirst();
		str1 = linkedList.getLast();
		
		linkedList.remove();
		linkedList.removeFirst();
		linkedList.removeLast();
		
	}

}
