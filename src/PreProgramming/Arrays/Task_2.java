package PreProgramming.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Task_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num above 5 digit ");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		int rev = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		while (temp != 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		int arr[] = new int[count];
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[x] = rev % 10;
			x++;
			rev /= 10;
		}
		System.out.println(Arrays.toString(arr));

		/*
		 * first index and last index sum are Equal to all elements between first and
		 * last element of array [1,2,3,4,8]
		 * 
		 * if{(1+8)==(2+3+4)}-----> XELOM ARRAY else{"phloem Array"}
		 */
		int essential_sum = 0;
		int mean_sum = 0;
		for (int k = 0; k < arr.length; k++) {
			essential_sum = arr[0] + arr[arr.length - 1];// 1+8=9
		}
		for (int j = 1; j < arr.length - 1; j++) {
			mean_sum = arr[j] + mean_sum;
			/*
			 * arr[j]= 2+0=2 arr[j]= 3+2=5 arr[j]= 4+5=9
			 * 
			 */
		}
		System.out.println(essential_sum + " ----  " + mean_sum);
		if (essential_sum == mean_sum) {
			System.out.println("xelom");
		} else {
			System.out.println("phloem");
		}

	}

}
