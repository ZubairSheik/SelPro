package org.do_while;

import java.util.Scanner;

public class Else_If {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Mark");
		int mark = sc.nextInt();
		System.out.println(mark);
		
		if (mark<=40) {
			
			System.out.println("fail");
		}
		else if (mark >=40 && mark < 50) {
			
			System.out.println("E Grade");
		}
		else if (mark >=50 && mark < 60) {
			
			System.out.println("D grade");
		}
		else if (mark >=60 && mark < 70) {
			
			System.out.println("C Grade");
		}
		else if (mark >=70 && mark < 80) {
			
		    System.out.println("B Grade");
		}
		else if (mark >=80 && mark < 90) {
			
			System.out.println("A Grade");
		}
		
		else {
			
			System.err.println("S Grade");
		}
		
		
		
		
	}
}
