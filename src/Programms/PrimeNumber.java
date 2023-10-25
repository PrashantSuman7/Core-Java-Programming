package Programms;

import java.util.Scanner;

class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number   :");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count++; break;
			}
		}
		if(count==2)
		{
			System.out.println("Not A Prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}
	}

}
