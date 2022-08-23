package org.Run_Time_Exception;

import java.util.ArrayList;
import java.util.List;

public class Index_OutofBound {
	
	public static void main(String[] args) {
		
		
		List<Object> obj = new ArrayList<>();
		
		obj.add("java");
		
		Object object = obj.get(2);
		
		System.out.println(object);
		
		
		
	}


}
