package org.Run_Time_Exception;

public class NumberFormat_Exception {
	
	public static void main(String[] args) {
		
		String s = "123abc";
		
		int a = Integer.parseInt(s);
		
		System.out.println(a+100);
	}

}
