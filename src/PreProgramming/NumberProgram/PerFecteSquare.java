package PreProgramming.NumberProgram;

import java.util.Scanner;

class PerFecteSquare {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 1; i <= num / 2; i++) {
			if (i * i == num) {
				System.out.println("Square root OF : " + num + " is " + i);
				flag = true;
			}
		}
		if(flag==true) {
			System.out.println("perfect Square");
		}
	}

}
