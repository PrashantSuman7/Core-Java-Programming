package Programms;
class SumOfArrayElement {
	public static void main(String[] args) {
		
		int arr[] = { 11, 21, 4, 13, 14 };
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
