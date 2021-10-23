package com.core.testCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTesting {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("banana");
		list.add("guvva");
		
		list.add(3, "kiwi");
		//list.add(0, "1");
		
		
		System.out.println(list+ "\n");
		
		
		Iterator it= list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("\n");
		  ListIterator<String> lit = list.listIterator(list.size());
		  while(lit.hasPrevious())
		  {
			  String str = lit.previous();
			  System.out.println(str);
		  }
		 
		
		

	}

}
