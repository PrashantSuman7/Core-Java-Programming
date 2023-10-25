package PreProgramming.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Above 4 digit ");
		int num = sc.nextInt();
		int temp = num;
		int num1 = num;
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		System.out.println(count);
		int x = 0;
		int arr[] = new int[count];
		while (num1 != 0) {
			int rem = num1 % 10;
			arr[x] = rem;
			num1 /= 10;
			x++;
		}
		Arrays.sort(arr);
		System.out.println("prime number");
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			if (arr[i] % 2 == 0) {
				flag = true;
			}

			if (flag == false) {
				System.out.println(arr[i]);
			}
		}
	}

}
