package org.Super;

public class Super_This_1 extends Super_This {
	
	    int g=10;
		
	public void sub() {
		
		int a = 10;
		int b = 30;
		int c = a-b;
		
		System.out.println(c);
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(this.g);
		
	}

	public static void main(String[] args) {
		
		Super_This_1 st=new Super_This_1();
		
		st.sub();
		
		add();
		
		
		
		
	}
}
