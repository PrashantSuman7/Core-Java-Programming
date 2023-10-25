package PreProgramming.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class SmallestElement_InArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println();
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int smallest=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("smallest Element in this array is : "+smallest);

	}

}
