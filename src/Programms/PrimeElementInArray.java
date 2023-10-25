package Programms;

class PrimeElementInArray {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 50, 20, 14, 32, 21, 45 };

		for (int i = 0; i < arr.length; i++) {
			primeNumber(arr[i]);

		}
	}

	private static void primeNumber(int i) {
		if (i % 2 == 0) {
			System.out.println(i + "  :Prime Number");
		} else {
			System.out.println(i + "  :not a prime number");
		}

	}

}
