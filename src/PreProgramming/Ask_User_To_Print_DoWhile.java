package PreProgramming;
/*
 * Final Class can't be extends(Inherited) Another Class........
 */
import java.util.Scanner;

/*
 * Print Welcome once And Ask the user to Print again and again
 */
class Ask_User_To_Print_DoWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Welcome");
			System.out.println("You want to Print Again then type y or enter n");
			ch = sc.next().charAt(0);
		} while (ch=='y');
		System.out.println("thank You");
	}

}
