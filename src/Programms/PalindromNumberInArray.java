package Programms;

import java.util.Arrays;

class PalindromNumberInArray {
	public static void main(String[] args) {
		
		int arr[] = { 101, 151, 50, 20, 14, 32, 21, 45 };
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			palindromNumberis(num);
		
		}
		
	}

	private static void palindromNumberis(int num) {
		int rev=0;
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(rev==temp)
			System.out.println(temp+"   :PalindromNumber");
	}

}
