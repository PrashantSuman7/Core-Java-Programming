package Programms;

import java.util.Scanner;

class SpyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num=sc.nextInt();
		
		int product=1,sum=0;
		
		while(num!=0)
		{
			int rem=num%10;
			sum+=rem;
			product*=rem;
			num/=10;
		}
		if(sum==product)
			System.out.println("spy-number");
		else
			System.out.println("not a spy-number");
	}

}
