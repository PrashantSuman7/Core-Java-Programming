package PreProgramming.NumberProgram;

import java.util.Scanner;

class Spy_Number {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int sum=0,product=1;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			product*=rem;
			num/=10;
		}
		if(sum==product) {
			System.out.println(" Spy Number : ");
		}else {
			System.out.println(" Not a Spy Number ");
		}
	}

}
