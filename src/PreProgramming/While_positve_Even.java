package PreProgramming;

class While_positve_Even {
	public static void main(String[] args) {
		int i = -5;

		while (i <= 5) {
			if (i % 2 == 0 && i >= 0) {
				System.out.println(i);

			}
			i++;
		}
	}

}
