package Programms;

import java.util.Scanner;

class SquareDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int square=0;
		while(num!=0)
		{
			int rem=num%10;
			System.out.println(rem +": Square is :"+rem*rem);
			num=num/10;
		}
		//System.out.print("Square digit :"+square);
		
	}

}
