package Programms;

import java.util.Scanner;

class PalindromNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println("Palindrom NUmber");
		}else
			System.out.println("Not a Palindrom Number....");
	}

}
