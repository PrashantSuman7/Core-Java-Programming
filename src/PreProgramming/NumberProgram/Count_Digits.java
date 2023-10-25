package PreProgramming.NumberProgram;

import java.util.Scanner;

class Count_Digits {
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int num=sc.nextInt();
		 
		 int digit=countDigit(num);
		 int evenDigit=countEvenDigits(num);
		 System.out.println("Digit in number : "+digit);
		 System.out.println("EvenDigit In number : "+evenDigit);
	}

	private static int countEvenDigits(int num) {
		int count=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				count++;
			}
			num/=10;
		}
		return count;
	}

	public static int countDigit(int num) {
		int count=0;
		while(num>0) {
			num/=10;
			count++;
		}
		return count;
	}

}
