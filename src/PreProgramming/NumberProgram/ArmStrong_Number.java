package PreProgramming.NumberProgram;

import java.util.Scanner;

class ArmStrong_Number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0, n = num, temp = num, count = 0;

		while (n > 0) {
			n /= 10;
			count++;
		}
		while (num > 0) {
			int base = num % 10;
			int pow = 1;
			for (int i = 1; i <= count; i++) {
				pow = base * pow;
			}
			sum += pow;
			num /= 10; 
		}
		if (temp == sum) {
			System.out.println("ArmStromg number..");
		} else {
			System.out.println("Not a ArmStrong Number ..");
		}
	}

}
