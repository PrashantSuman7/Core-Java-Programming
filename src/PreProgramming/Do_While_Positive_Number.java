package PreProgramming;
/*
 * Wajp to Print Positive Integer Number In the Range of (-5 to 5);
 */
class Do_While_Positive_Number {
	public static void main(String[] args) {
		int i = -5;   // initialization
		do {
			if (i % 2 == 0 && i >= 0) {
				System.out.println(i);
			}
			i++;  // Updation

		} while (i <= 5); //Conditon....
	}

}
