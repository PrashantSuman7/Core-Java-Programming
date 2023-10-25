package Programms;

import java.util.Scanner;

class SumOfDigit {
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The Number");
		 int num=sc.nextInt();
		 int sum=0;
		 while(num!=0) {
			 int rem=num%10;
			 if(rem%2!=0)
				 sum+=rem;
			
			 num/=10;
		 }
		 System.out.print("Sum OF odd digits  :"+sum);
	}

}
