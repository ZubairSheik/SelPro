package org.Exception;

public class Try_Catch {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		int c = 0;
		
		try {

			String s = "Python";
			char charAt = s.charAt(6);
		//	System.out.println(charAt);
		}

		catch (Exception e) {

		//	System.err.println("Exception Occured");

		}
		

		try {

			int arr[] = null;
		//	System.out.println(arr[1]);

		}

		catch (NullPointerException e) {

			System.err.println("Null Pointer Exception Occured");

		}
		
		try {

			c = a / b;
		} 
		
		catch (ArithmeticException e) {

			System.err.println("Arithimetic Exception Occured");

		}
		
		finally {
			
			System.out.println("Whatever exception occured , this must be printed");
		}
		
		
	//	System.out.println(c);

	//	System.out.println("Rest of the program");
	}

}


// Throw

// it is inside the mehtod
// it will throw the exception
// Throw - it will throw the only one exception


// Throws

// It is in the method level
// It will declare the exception
//Throws - it will declare more than one exception


