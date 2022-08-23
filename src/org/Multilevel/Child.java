package org.Multilevel;

public class Child extends Father{
	
	private void Bike() {
		System.out.println("Yamaha");
			
	}

	public static void main(String[] args) {
		
		Child c = new Child();
		c.Property();
		c.Vehicle();
		c.Busniess();
		c.Gold();
		c.Bike();
				
	}
}
