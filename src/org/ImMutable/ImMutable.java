package org.ImMutable;

public class ImMutable {

	
	public static void main(String[] args) {
		
		String s = "Welcome to the world";
		
		String s1 = "Welcome to the world";
				
		System.out.println(System.identityHashCode(s));
		
		System.out.println(System.identityHashCode(s1));
		
		String a = s1+s;
		
		System.out.println(a);
		
		System.out.println(System.identityHashCode(a));
	}
}
