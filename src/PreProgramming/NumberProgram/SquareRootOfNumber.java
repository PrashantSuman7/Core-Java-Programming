package PreProgramming.NumberProgram;

import java.util.Scanner;

class SquareRootOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		for (int i = 1; i <= num / 2; i++) {
			if (i * i == num) {
				System.out.println(i);
				break;
			}
		}
	}

}
