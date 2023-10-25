package PreProgramming.Arrays;
class AvarageOfOdd_IndexElement {
	public static void main(String[] args) {
		int arr[]= {2,4,5,6,4};
		int sum=0,count=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				count++;
				sum+=arr[i];
			}
			
		}
		System.out.println(sum+"    "+count);
		System.out.println(sum/count);
	}

}
