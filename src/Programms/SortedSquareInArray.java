package Programms;

import java.util.Arrays;

class SortedSquareInArray {
	public static void main(String[] args) {

		int arr[] = { 11, 21, 4, 13, 14 };

		Arrays.sort(arr);

		int[] shortedSquare = SortedSquareArray(arr);
		
		for(int i=0;i<shortedSquare.length;i++)
		{
			System.out.println(shortedSquare[i]);
		}
	}

	private static int[] SortedSquareArray(int[] arr) {
		int sortedArray[] = new int[arr.length];
		int start = 0;
		int end = arr.length - 1;
		int squareIndex = arr.length - 1;

		while (start <= end) {
			if(arr[start]*arr[start]>arr[end]*arr[end])
			{
				sortedArray[squareIndex--]=arr[start]*arr[start];
				start++;
			}
			else {
				sortedArray[squareIndex--]=arr[end]*arr[end];
				end--;
			}

		}

		return sortedArray;

	}
}
