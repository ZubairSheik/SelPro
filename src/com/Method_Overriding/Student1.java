package com.Method_Overriding;

public class Student1 extends Method_Overriding{
	
	@Override
	public void applicatio_form(String name) {
		super.applicatio_form(name);
	}

	@Override
	public void application_form(int age, String Bgroup) {
		super.application_form(age, Bgroup);
	}
	@Override
	public void application_form(long mobile, String Degree) {
		super.application_form(mobile, Degree);
	}
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		
		s1.applicatio_form("Sheik");
		s1.application_form(27, "O+");
		s1.application_form(9176280, "BCA");
		
		
	}
	
	
}


