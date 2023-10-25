package PreProgramming.Arrays;

class EvenElement_inArray {
	public static void main(String[] args) {
		int arr[] = { 7, 8, 2, 4, 5, 2 };
		int evenSum=0,oddSum=0;
		//System.out.println("even element");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				evenSum+=arr[i];
			}else {
				oddSum+=arr[i];
			}
		}
		System.out.println("Even Sum : "+evenSum);
		System.out.println("odd Sum : "+oddSum);
	}

}
