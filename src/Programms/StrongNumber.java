package Programms;

import java.util.Scanner;

class StrongNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number  :");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		System.out.println("Sum Of Factorial of Digits  :"+sum);
		if(sum==temp)
		{
			System.out.println("Strong Number");
		}else
			System.out.println("not a strong Number");
	}

	private static int factorial(int rem) {
		int factorial=1;
		for(int i=1;i<=rem;i++)
		{
			 factorial=factorial*i;
		}
		//System.out.println(factorial);
		return factorial;
	}

}
