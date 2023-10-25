package PreProgramming.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Binary__Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println();
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the Element to found");
		int ele = sc.nextInt();

		int l = 0, r = arr.length - 1;
		boolean flag = false;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (ele == arr[mid]) {
				System.out.println("Element Found");
				flag = true;
				break;

			} else if (ele > arr[mid]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		if(flag==false) {
			System.out.println("Element Not Found");
		}

	}

}
