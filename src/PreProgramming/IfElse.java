package PreProgramming;

import java.util.Scanner;

class IfElse  {
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Size of Tshirt");
		 char ch=sc.next().charAt(0);
		 System.out.println("Enter the Size of price");
		 int price=sc.nextInt();
		 if(ch=='s' && price>=1000) {
			 System.out.println("Sized Perfect for tom");
		 }else {
			 System.out.println("Try Another");
		 }
				 
	}

}
