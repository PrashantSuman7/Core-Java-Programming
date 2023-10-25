package Programms;

import java.util.Scanner;

class SunnyNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number :");
		int num=sc.nextInt();
		int res=num+1;
		boolean flag=false;
		for(int i=1;i<=res/2;i++)
		{
			int x=i*i;
			if(x==res)
			{
				flag=true;
				System.out.println("Sunny number");
			}
		}
		if(flag!=true)
			System.out.println("not a sunny number");
	}

}
