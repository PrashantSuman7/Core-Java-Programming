package PreProgramming.NumberProgram;

import java.util.Scanner;

class Happy_Number {
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number : ");
		 int num=sc.nextInt();
		 
		 while(num!=1 && num!=4) {
		 int sum=0;  
		 while(num>0) {
			 int rem=num%10;
			 int square=rem*rem;
			 sum+=square;
			 num/=10;
		 }
		 System.out.println(sum);

		 if(sum==1) {
			 System.out.println("Happy Number");
			 break;
		 }else if(sum==4){
			 System.out.println("UnHappy Number");
		 }
		
		 num=sum;
	}
		 
	 
	 }
}
