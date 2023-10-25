package Programms;

import java.util.Scanner;

class PerfactNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number  :");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum = sum + i;
		}
		if (sum == temp) {
			System.out.println("Perfect-Number");
		} else
			System.out.println("not a Perfect Number");
	}

}
