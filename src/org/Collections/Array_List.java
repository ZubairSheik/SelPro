package org.Collections;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	
	public static void main(String[] args) {
		
		List<Object> obj = new ArrayList<>();
		
		obj.add("selenium");
		obj.add("java");
		obj.add("Python");
		obj.add("interface");
		obj.add(10);
		obj.add("205");
		obj.add(10);
		obj.add("Class");
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
		Object object = obj.get(2);
		System.out.println(object);
		
		obj.set(6, 20.33);
        System.out.println(obj);
        
        obj.remove(5);
        System.out.println(obj);
		
        int indexOf = obj.indexOf(10);
        System.out.println(indexOf);
        
        boolean contains = obj.contains("java");
        System.out.println(contains);
        
//        obj.clear();
//        System.out.println(obj);

        List<Object> obj1 = new ArrayList<>();
        
        obj1.add("java");
		obj1.add("Python");
		obj1.add("selenium");
		obj1.add("interact");
		obj1.add(100);
		obj1.add("203");
		obj1.add(20.35);
		obj1.add("student");

//		obj1.addAll(obj);
//		System.out.println(obj1);
		
//		obj1.retainAll(obj);
//		System.out.println(obj1);
		
		obj1.removeAll(obj);
		System.out.println(obj1);
      
	}

}



// List

// it is an interface
//it is an index based
// it will allow duplicate values
// its prints in insertion order

// there are three types in list

// Array List and Linked List , Vector List 

