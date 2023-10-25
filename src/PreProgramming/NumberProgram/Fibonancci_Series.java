package PreProgramming.NumberProgram;
class Fibonancci_Series {
	public static void main(String[] args) {

		int n1 = 0, n2 = 1, range = 5;

		for (int i = 1; i <= range; i++) {
			System.out.println(n1);
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;

		}

	}

}
