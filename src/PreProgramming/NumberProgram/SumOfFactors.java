package PreProgramming.NumberProgram;

import java.util.Scanner;

class SumOfFactors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		
		int sum=0;
		while(num>0) {
			int fact=1;
		 int rem=num%10;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;	
		}
		sum+=fact;
		num/=10;
		}
		System.out.println(sum);
		}

}
