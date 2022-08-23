package com.Scanner;

import java.util.Scanner;

public class Scanner_Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the PIN");
		int Pin = sc.nextInt();
		System.out.println(Pin);
		
		System.out.println("Enter Amount");
		long Amount = sc.nextLong();
		System.out.println(Amount);
		
		System.out.println("Check Available Balance");
		float Balance = sc.nextFloat();
		System.out.println(Balance);
		
	}
	
}
