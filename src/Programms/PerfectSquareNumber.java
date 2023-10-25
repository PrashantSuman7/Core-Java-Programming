package Programms;

import java.util.Scanner;

class PerfectSquareNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int x = 0;
		for (int i = 0; i <= num / 2; i++) {
			x = i * i;
			if (x == num) {
				System.out.println("Perfect square" + x);
			} else
				continue;
		}

	}

}
