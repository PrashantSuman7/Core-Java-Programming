package Programms;

import java.util.Scanner;

class EvenOdd {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Number for Creating table :");
		//int num=sc.nextInt();
		int evensum=0;
		int oddsum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				evensum+=i;
			}else
			{
				oddsum+=i;
			}
			//System.out.println(i*num);
		}
		System.out.println("SumOfEven :"+evensum+"   "+"OddSum  :"+oddsum);
	}

}
