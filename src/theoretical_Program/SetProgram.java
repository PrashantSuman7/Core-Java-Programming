package theoretical_Program;


import java.util.*;
import java.util.Set;

class SetProgram {
	public static void main(String[] args) {
		//int arr[]= {10,20,60,30,10,20,50,40};  
		Set<Integer> set=new TreeSet<Integer>();
		set.add(100);
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(10);
		
		for (Integer integer : set) {
			
			System.out.println(integer);
			  
		}
		
	}

}
