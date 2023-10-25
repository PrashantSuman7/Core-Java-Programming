package Programms;

import java.util.Scanner;

class DesariumNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number  :");
		int num=sc.nextInt();
		int sum=0,temp=num;
		int digits=countDigit(num);
		
		while(temp!=0)
		{
			int rem=temp%10;
			sum+=Math.pow(rem, digits);
			digits--;
			temp/=10;
		}
		if(sum==num)
		{
			System.out.println("Disarium Number");
		}else
		{
			System.out.println("Not a Disarim Number");
		}
	}

	private static int countDigit(int num) {
		
		int count=0;
	while(num!=0)
		{
			int rem=num%10;
			count++;
			num/=10;
		}
		return count;
	}

}
