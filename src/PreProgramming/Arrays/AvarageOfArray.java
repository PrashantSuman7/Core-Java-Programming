package PreProgramming.Arrays;
class AvarageOfArray {
	public static void main(String[] args) {
		int arr[]= {2,4,1,5,6};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		System.out.println("Avarage OF an Array is :"+(sum/arr.length));
	}

}
