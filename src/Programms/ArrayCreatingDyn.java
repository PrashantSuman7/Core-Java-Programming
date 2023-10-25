package Programms;

import java.util.Iterator;
import java.util.Scanner;

class ArrayCreatingDyn {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size Of element :");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
