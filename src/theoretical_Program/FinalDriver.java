package theoretical_Program;

import java.util.*;

class FinalDriver extends Collage {
	 int a=80;
	 int b=90;
	public static void main(String[] args) {
		Set l1=new TreeSet<>();
		
		
		l1.add(10);
		l1.add(12);
		l1.add(10);
		l1.add(15);
		l1.add(101);
		// l1.add("hello");
		//l1.add(null);
		
		System.out.println(l1);
		
		 Collage c1=new FinalDriver();//up-CAsting 
		 
		 FinalDriver f1=(FinalDriver)c1;//Down-Casting
		 
		 System.out.println(f1.x);
			System.out.println(f1.y);
			System.out.println(f1.a);
			System.out.println(f1.b);
		 
		 System.out.println("===================================");
		 Collage collage=new FinalDriver();
		 collage.Add(20, 60);
		 System.out.println(collage.x);
		System.out.println(collage.y);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		FinalDriver fd=new FinalDriver();
		fd.Add(40, 60);
		System.out.println(fd.x);
		System.out.println(fd.y);
		
	}
}
 
 class Collage
 {
	 final int d = 0 ;
	 final int x=10;
	final int y=20;
	 
	 final void Add(int x , int y)
	 {
		 System.out.println(x+y);
	 }
 }
