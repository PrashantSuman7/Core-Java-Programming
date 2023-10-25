package Programms;

import java.util.Arrays;

class DeleteDuplicateElement {

	public static void main(String[] args) {
		
		int arr[]= {10,50,20,14,14,32,21,45};
		int n=arr.length;
		removeDuplicate(arr,n);
	}

	private static void removeDuplicate(int[] arr , int n) {
		int x=0;
		Arrays.sort(arr);
		int res[]=new int[n];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				res[x++]=arr[i];
			}
		}
		res[x++]=arr[n-1];
		for(int i=0;i<x;i++)
		{
			System.out.print(res[i]+" ");
		}
	}

}
