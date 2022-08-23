package org.Armstrong_Num;

import java.util.Scanner;

public class Armstrong_Num {
	
	public static void main(String[] args) {
		
		int rem = 0;
		
		int ans = 0;
		
		System.out.println("Enter you three digit number");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		
		int a =n;
		
		while (n>0) {
			
			rem = n % 10;
			ans = ans+(rem*rem*rem);
			n = n/10;
			
		}
		if (ans==a) {
			
			System.out.println("Given number is armstrong number");
			
			
			
			
		} else {
			
			
			System.out.println("Not a armstrong number");

		}
		
		
	}

}
