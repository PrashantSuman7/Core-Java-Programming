package PreProgramming.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Lenear___Search {
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println();
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		System.out.println("Enter the Number you Find IN array");
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Element Founded In array : " + num);
		} else {
			System.out.println("Element is not Present");
		}
	}

}
