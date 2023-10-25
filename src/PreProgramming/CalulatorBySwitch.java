package PreProgramming;

import java.util.Scanner;

class CalulatorBySwitch {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1) Addition");
		System.out.println("2) Substraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");
		System.out.println("Enter your Choise");
		int choise=sc.nextInt();
		System.out.println("----------------------------------");
		System.out.println("Enter Two Values....");
		int x=sc.nextInt();
		int y=sc.nextInt();
		switch (choise) {
		case 1: System.out.println("Addition of "+x+" and  "+y+" is :"+(x+y));
		break;
		case 2: System.out.println("Substraction of "+x+"  and  "+y+" is :"+(x-y));
		break;
		case 3: System.out.println("Multiplication of "+x+"  and  "+y+" is :"+(x*y));
		break;
		case 4: System.out.println("Division of "+x+"  and  "+y+" is :"+(x/y));
		break;
			

		default:System.out.println("invalid Selection");
			break;
		}

	}

}
