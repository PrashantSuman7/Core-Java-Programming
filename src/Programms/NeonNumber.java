package Programms;

import java.util.Scanner;

class NeonNumber {
	public static void main(String[] args) {
		/*
		 * Sum of the each digits of Square of the Given Number  
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number  :");
		int num=sc.nextInt();
		int temp=num;
	   int square=num*num , sum=0;
	   
	   while(square!=0)
	   {
		   int rem=square%10;
		   sum+=rem;
		   square/=10;
	   }
	   if(sum==temp)
		   System.out.println("neon-number");
	   else
		   System.out.println("not a neon number");
	}

}
