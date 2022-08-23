package org.Method_Overloading;

public class Method_Overloading {
	
	public void Show_Room(String Brandname) {
		System.out.println(Brandname);
		
	}
	public void Show_Room(String Area, int Pincode) {
		System.out.println(Area);
		System.out.println(Pincode);
		
	}
	public void Show_Room(long contactnumber, int manufacturingyear) {
		System.out.println(contactnumber+"  "+manufacturingyear);
		
	}

	public static void main(String[] args) {
		
		Method_Overloading m = new Method_Overloading();
		m.Show_Room("Java");
		m.Show_Room(9176280, 2022);
		m.Show_Room("Chennai", 600081);
		
	}
}

//Method Overloading or static binding or compile time polymorphism

//class name and method name should be same
//But arguments or parameter will be different
//Method overloading increase the readability of the program

