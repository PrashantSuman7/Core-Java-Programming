package Programms;
class SumOFEvenElement {
	public static void main(String[] args) {
		int arr[] = { 11, 21, 4, 13, 14 };
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				sum+=arr[i];
		}
		System.out.println(sum);
	}

}
