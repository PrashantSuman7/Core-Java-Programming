package PreProgramming.Arrays;

import java.util.Arrays;

class Insert_Element {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int arr1[]=new int[arr.length+1];
		int ele=40,index=3;
		int j=0;
		for(int i=0;i<arr1.length;i++) {
			if(i==index) {
				arr1[i]=ele;
			}else {
				arr1[i]=arr[j];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}

}
