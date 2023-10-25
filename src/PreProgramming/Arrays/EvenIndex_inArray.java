package PreProgramming.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class EvenIndex_inArray {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of an array");
		 int size=sc.nextInt();
		 int arr[]=new int[size];
		 
		System.out.println("Enter the element");
		for(int k=0;k<size;k++) {
			arr[k]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Values Present in Even index : ");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
