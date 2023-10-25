package PreProgramming.Arrays;
class AvarageOf__EvenElement_inArray {
	public static void main(String[] args) {
		int arr[]= {3,4,2,8,7,10};
		int sum=0,count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
				count++;
			}
		}
		System.out.println(sum/count);
	}

}
