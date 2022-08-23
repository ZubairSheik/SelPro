package org.Run_Time_Exception;

public class String_Index_OutofBounds {

	public static void main(String[] args) {
		
		String s = "Selenium";
		
		char charAt = s.charAt(10);
		System.out.println(charAt);
	}
}
