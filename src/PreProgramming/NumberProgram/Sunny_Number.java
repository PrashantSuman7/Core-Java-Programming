package PreProgramming.NumberProgram;

import java.util.Scanner;

class Sunny_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int nextnum = num + 1;
		int i;
		for (i = 1; i <= nextnum / 2; i++) {
			if (i * i == nextnum) {
				System.out.println("Sunny Number");
				break;
			}

		}

	}

}
