package PreProgramming.Arrays;

import java.util.Arrays;

class Remove__Element {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,90,50};
		int arr1[]=new int[arr.length-1];
		int ele=90;
		int index=4;
		int j=0;
		for(int i=0;i<arr1.length;i++) {
			if(i==index) {
				j++;
			}
			arr1[i]=arr[j];
			j++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}

}
