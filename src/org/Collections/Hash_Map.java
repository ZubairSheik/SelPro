package org.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {
	
	public static void main(String[] args) {
		
		Map<Integer , Object> obj = new HashMap<>();
		
		obj.put(1, "java");
		obj.put(2, "selenium");
		obj.put(3, "python");
		obj.put(4, 2.33);
		obj.put(5, null);
		obj.put(6, 10);
		obj.put(5, "HashMap");
		
		System.out.println(obj);
		
		Set<Entry<Integer, Object>> entrySet = obj.entrySet();
		
		for (Entry<Integer, Object> entry : entrySet) {
			
			System.out.println(entry);
			
		}
	
		
		
		
//		int size = obj.size();
//		System.out.println(size);
//		
//		Object object = obj.get(6);
//		System.out.println(object);
//		
//		Set<Integer> KeySet = obj.keySet();
//		System.out.println(KeySet);
//		
//		Collection<Object> values = obj.values();	
//		System.out.println(values);
//		
//		obj.remove(5);
//		System.out.println(obj);
//		
//	    boolean containsKey = obj.containsKey(6);
//	    System.out.println(containsKey);
//	    
//	    boolean containsValue = obj.containsValue(2.33);
//	    System.out.println(containsValue);
//	    
//	    
//	    
	}

}

// it will not allow duplicate value, it can be override

// it will allow over ride null

// the value will allow duplicate

// the value will allow both null
