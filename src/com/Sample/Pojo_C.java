package com.Sample;

public class Pojo_C {
	
	public static void main(String[] args) {
		
		Pojo_A a = new Pojo_A();
		
		int age = a.getAge();
		System.out.println(age);
		
		a.setAge(65);
		
		int age2 = a.getAge();
		System.out.println(age2);
		
		
	}

}
