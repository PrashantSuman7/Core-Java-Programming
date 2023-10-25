package PreProgramming.Arrays;

import java.util.Arrays;

class Marge__TwoArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int brr[]= {7,8,9,10,11,12};
		int res[]=new int[arr.length+brr.length];
		int j=0;
		for(int i=0;i<res.length;i++) {
			
			if(i<arr.length) {
				res[i]=arr[i];
			}else {
				res[i]=brr[j];
				j++;
			}
			
		}
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("brr : "+Arrays.toString(brr));
		System.out.println("After Marge  : ");
		System.out.println("res : "+Arrays.toString(res));
	}

}
