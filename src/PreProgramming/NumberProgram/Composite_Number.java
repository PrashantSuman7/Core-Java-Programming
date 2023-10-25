package PreProgramming.NumberProgram;

import java.util.Scanner;

/*
 * WAJP to find COmposite Number
 */
class Composite_Number {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number :");
		 int num=sc.nextInt();
		 int count=0;
		 for(int i=1;i<=num/2;i++) {
			 if(num%i==0) {
				 count++;
			 }
		 }
		 if(count>2) {
			 System.out.println("Compositie Number");
		 }else {
			 System.out.println("Not a Compositie Number");
		 }
	}

}
