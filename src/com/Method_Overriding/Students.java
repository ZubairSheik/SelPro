package com.Method_Overriding;

public class Students extends Method_Overriding{

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
		
		Students s = new Students();
		
		s.applicatio_form("Zubair");
		s.application_form(27, "O+");
		s.application_form(9176280, "BCA");
		
		
	}
}

