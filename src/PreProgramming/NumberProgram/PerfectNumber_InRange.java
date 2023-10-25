package PreProgramming.NumberProgram;

/*
 * Perfect Number Is sum Of the Factor Are equals to the given Number....
 */

class PerfectNumber_InRange {
	public static void main(String[] args) {
		for (int n = 1; n <= 10000; n++) {
			int sum = 0;
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0)
					sum += i;
			}
			if (sum == n) {
				System.out.print( n+" ");
			}

		}
	}

}
