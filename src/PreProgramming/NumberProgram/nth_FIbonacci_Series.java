package PreProgramming.NumberProgram;

import java.util.Scanner;

class nth_FIbonacci_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 1;
		System.out.println("Enter the Range : ");
		int range = sc.nextInt();
		System.out.println("Enter the Target");
		int target = sc.nextInt();

		for (int i = 1; i <= range; i++) {
			if (target == i) {
				System.out.println(n1 + " ");
			}
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
	}

}
