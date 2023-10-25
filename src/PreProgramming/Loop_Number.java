package PreProgramming;

class Loop_Number {
	public static void main(String[] args) {
//		for (int j = 1; j !=1; j++) { 
//			/*
//			 * Outer for loop user to traver the Rows;
//			 */
//			
//			for (int i = 1; i <= 4; i++) {
//				/*
//				 * Inner loop perform the Task
//				 */
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
	int i=1;
	 while(i<=4) {
		 int j=1;
		 while(j<=4) {
			 System.out.print(j+" ");
			 j++;
		 }
		 System.out.println();
		 i++;
	}
	}

}
