package PreProgramming.NumberProgram;

import java.util.Scanner;

class FIbonacci_InRange {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the StartingRange");
		int start = sc.nextInt();
		System.out.println("Enter the EndgRange");
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			if (n1 >= start && n1 <= end) {
				System.out.println(n1 + " ");
			}
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
	}

}
