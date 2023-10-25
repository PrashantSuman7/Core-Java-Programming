package theoretical_Program;

import java.util.Scanner;

 class UncheckedException {

	public static void main(String[] args) {
	
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the value of a :");
		int a=sc.nextInt();
		System.out.println("Enter the Value of b  :");
		int b=sc.nextInt();
		System.out.println("Start");
		try
		{
		int res=a/b;  //Exception causing statement 
		
		System.out.println(res); //exception related statement 
		}
		catch(ArithmeticException w)
		{
			System.out.println("Exception Handled : resone : Divided by Zero");
		}
		System.out.println("Stop");

	}

}
