package Programms;

import java.util.Scanner;

class ReverseNUmber {
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the Number  :");
		  int num=sc.nextInt();
		  int rev = 0;
		  while(num!=0) {
			  int rem=num%10;
			  rev=rev*10+rem;
			  num=num/10;
		  }
		  
		  System.out.println("reverse OF this number is :"+rev);
	}

}
