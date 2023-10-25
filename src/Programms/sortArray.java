package Programms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class sortArray {
	public static void main(String[] args) {
		
		int arr[]= {10,50,20,14,14,32,21,45};
		//Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length-1;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		
		
		Set<Integer> set=new TreeSet<Integer>();
		
		for (Integer integer : arr) {
			
			set.add(integer);
		}
		System.out.println(set);
	}

}
