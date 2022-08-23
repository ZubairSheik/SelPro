package org.Collections;

import java.util.LinkedHashSet;
import java.util.Set;


public class Linked_HashSet {

public static void main(String[] args) {
		
		Set<Integer> obj = new LinkedHashSet<>();
		
		obj.add(20);
		obj.add(10);
		obj.add(50);
		obj.add(60);
		obj.add(30);
		obj.add(40);
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
		boolean contains = obj.contains(50); // it will consider the value not index
		System.out.println(contains);
		
		obj.remove(50);
		System.out.println(obj);
		
//		obj.clear();
//		System.out.println(obj);
		
	Set<Integer> obj1 = new LinkedHashSet<>();
		
		obj1.add(20);
		obj1.add(100);
		obj1.add(90);
		obj1.add(45);
		obj1.add(60);
		obj1.add(40);
		
		System.out.println(obj1);
		
//		obj1.addAll(obj);
//		System.out.println(obj1);
		
//		obj1.retainAll(obj);
//		System.out.println(obj1);

		obj1.removeAll(obj);
		System.out.println(obj1);
		
	}

}

// it pints in insertion order\
// it will not allow duplicate values