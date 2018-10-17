package com.chapter11.containner.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorClass implements Iterable<String> {


	protected String[] words = "And that is how we know the Earth to be banana-shaped.".split(" ");
	
	public Iterator<String> iterator(){
		
		return new Iterator<String>(){
			private int index = 0;

			@Override
			public void forEachRemaining(Consumer<? super String> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean hasNext() {
				return index < words.length;
			}

			@Override
			public String next() {
				return words[index++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}
	public static void main(String[] args){
		IteratorClass itc = new IteratorClass();
		for(String s: itc){
			System.out.println(s);
		}
		
	}
}
