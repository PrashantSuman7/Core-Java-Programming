package PreProgramming.NumberProgram;

import java.util.Scanner;
class Automorphic_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check");
		int num = sc.nextInt();
		boolean flag=isAutomorfic(num);
		if(flag==true) {
			System.out.println("automrphic");
	}else {
		System.out.println("Not automorphic");
	}
	}
	private static boolean isAutomorfic(int num) {
		int sq=num*num;
		while(num>0) {
			if(num%10 != sq%10) {
				return false;
			}
			num/=10;
			sq/=10;
		}
		return true;
		}
		
	}