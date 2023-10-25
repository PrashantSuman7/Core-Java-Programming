package PreProgramming.NumberProgram;

import java.util.Scanner;

class StrongNumber_InRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range ");
		int num = sc.nextInt();

		for (int i = 100; i <= num; i++) {
			int temp = i;
			int num1 = i;
			int sum = 0;
			while (num1 != 0) {
				int fact = 1;

				int rem = num1 % 10;
				
				for (int k = 1; k <= rem; k++) {
					fact = fact * k;
				}
				sum += fact;
				num1 /= 10;
			}
			if (temp == sum) {
				System.out.print(" " + temp);
			}

		}

	}
}
