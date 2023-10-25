package PreProgramming.NumberProgram;
 class Sum_Of_EvenNumber_InRange {
	 public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("Sum Of even number Is  :"+sum);
	}

}
