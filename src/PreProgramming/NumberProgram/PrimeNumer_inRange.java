package PreProgramming.NumberProgram;

class PrimeNumer_inRange {
	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			int count = 0;
			for (int k = 1; k <= i; k++) {
				if (i % k == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.print(i);
			}
		}
	}

}
