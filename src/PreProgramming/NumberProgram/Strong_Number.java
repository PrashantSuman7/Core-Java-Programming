package PreProgramming.NumberProgram;

import java.util.Scanner;

class Strong_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int fact = 1;
			int rem = num % 10;
			for (int i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;

			num /= 10;

		}
		if (temp == sum) {
			System.out.print(" Strong Number :  " + temp);
		} else {
			System.out.println("not");
		}

	}

}
