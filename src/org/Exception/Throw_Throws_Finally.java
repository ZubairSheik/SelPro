package org.Exception;

public class Throw_Throws_Finally {
	
	public static void validate (int age) throws Throwable {
		
		if (age>= 18 ) {
			
			System.out.println("Eligible for vote");
			
		}
		
		else {
			
			throw new AgeAlertException("not eligile");
		}
	}

    public static void main(String[] args) throws Throwable {
    	
    	validate(17);
	
		
		
}
    
}
