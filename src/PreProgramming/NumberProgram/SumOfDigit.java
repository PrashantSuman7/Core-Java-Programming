package PreProgramming.NumberProgram;
class SumOfDigit {
	/*
	 * WaJp to sum Of digit in a Number.....
	 */
	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("Sum Of Digit IS :"+sum);
	}

}
