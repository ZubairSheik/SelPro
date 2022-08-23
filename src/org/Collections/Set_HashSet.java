package org.Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {

	public static void main(String[] args) {

		Set<Object> obj = new HashSet<>();

		obj.add("java");
		obj.add("selenium");
		obj.add("pyton");
		obj.add(null);
		obj.add(null);
		obj.add(20.35);
		obj.add(10);

		System.out.println(obj);

		int size = obj.size();
		System.out.println(size);

		boolean contains = obj.contains(20.35);
		System.out.println(contains);

		obj.remove(null);
		System.out.println(obj);

//		obj.clear();
//		System.out.println(obj);

		Set<Object> obj1 = new HashSet<>();

		obj1.add("java");
		obj1.add(100);
		obj1.add(20.35);
		obj1.add(null);
		obj1.add("A");
		obj1.add(10);
		obj1.add("python");

		System.out.println(obj1);

//		obj1.add(obj);
//		System.out.println(obj1);

		
//		obj1.removeAll(obj);
//		System.out.println(obj1);

		obj1.retainAll(obj);
		System.out.println(obj1);
	
	}

}


// it prints in random order
// it will not allow duplicate value
// it will allow single null value. not a duplicate null value