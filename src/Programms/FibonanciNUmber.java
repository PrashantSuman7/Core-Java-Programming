package Programms;

import java.util.Scanner;

class FibonanciNUmber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		int f1=0,f2=1;
		
		for(int i=1;i<=num;i++)
		{
		System.out.println(" "+f1);
			int temp=f1+f2;
			f1=f2;
			f2=temp;
		}
		
	}

}
