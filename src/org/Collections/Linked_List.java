package org.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	
	
	public static void main(String[] args) {
		
		List<Object> obj = new LinkedList<>();
		
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

        List<Object> obj1 = new LinkedList<>();
        
        obj1.add("java");
		obj1.add("Python");
		obj1.add("selenium");
		obj1.add("interact");
		obj1.add(100);
		obj1.add("203");
		obj1.add(20.35);
		obj1.add("student");

//		obj1.addAll(obj);
//        System.out.println(obj1);
		
//		obj1.retainAll(obj);       // Retain All - will take same value
//		System.out.println(obj1); 
		
		obj1.removeAll(obj);      // Remove All will take aprat from the same value  
        System.out.println(obj1);
      
	}

	

}
