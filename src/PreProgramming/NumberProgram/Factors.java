package PreProgramming.NumberProgram;

import java.util.Scanner;

class Factors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number  :");
		int num=sc.nextInt();
		System.out.println("Factors of this number is :");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
