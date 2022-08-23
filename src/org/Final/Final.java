package org.Final;

public final class Final {
	
	int a = 10;
	int b = 10;
	
  public final void add() {
	  
	  int c =100;
	  int d = 150;
	  int e = c+d;
	  System.out.println(e);
	
}
  
  private static void Value() {

	 final  double a= 20.5; // - Final is keyword, it will not allow to change the value
	  
	//  a++;
	 
	  System.out.println(a);
}
  
	
  public static void main(String[] args) {
	
	  Final f = new Final();
	  f.add();
	  
	  System.out.println(f.a);
	  System.out.println(f.b);
	  
	  Value();
	  
  }
}


// Final class cannot be interface
// Final method cannot be overriden
// Final variable cannot be changed

//Finalize it is a method - It removes the garbage values
