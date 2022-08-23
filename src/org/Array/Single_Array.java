package org.Array;

public class Single_Array {

	public static void main(String[] args) {

		{
			int a[] = new int[5];

			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			a[3] = 40;

			System.out.println(a[2]);
			System.out.println("*************");
			
			

		}

		{

			String a[] = {"Java", "Python", "Selenium","Testing", "Program"};

			
			for (String i : a) {
				
				System.out.println(i);
			
			}
			System.out.println("*********");
		}

		{
			int a[] = new int[5];

			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			a[3] = 40;
			a[4] = 50;

			for (int i = 0; i <5; i++) {
				
				System.out.println(a[i]);
				
			}
		

		}

	}

}