package Programms;

import java.util.Arrays;

class CountFrequenciesInArray {
	public static void main(String[] args) {
		
		int arr[]= {10,50,20,14,14,32,21,45,14,21,45,10,50,50,50,50};
		Arrays.sort(arr);
		int n=arr.length;
		boolean vic[]=new boolean[n];
		Arrays.fill(vic, false);
		System.out.println("-----------------------------");
		System.out.println("Element||Count");
		
		for(int i=0;i<n;i++)
		{
			if(vic[i]==true)
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					vic[j]=true;
					count++;
				}
			}
			System.out.println(arr[i]+"    |    "+count);
		}
		System.out.println("--------------");
		
	}

}
