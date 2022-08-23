package org.Mutable;

public class Mutable {

	public static void main(String[] args) {

		{
			StringBuffer s = new StringBuffer("java");
			StringBuffer s1 = new StringBuffer("java");

			System.out.println(System.identityHashCode(s));

			System.out.println(System.identityHashCode(s1));

			s1.append(s);

			System.out.println(s1);

			System.out.println(System.identityHashCode(s1));
			
		}
		
		System.out.println("************************************");

		{
			StringBuilder s = new StringBuilder("java");
			StringBuilder s1 = new StringBuilder("java");

			System.out.println(System.identityHashCode(s));

			System.out.println(System.identityHashCode(s1));

			s1.append(s);

			System.out.println(s1);

			System.out.println(System.identityHashCode(s1));

		}
	}

}