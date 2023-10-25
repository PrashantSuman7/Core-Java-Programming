package Programms;
class NextGreaterElement {
	public static void main(String[] args) {
		
		int arr[]= {11,21,4,13,14};
		
		nextGreaterElement(arr);
	}

	private static void nextGreaterElement(int[] arr) {
		int next=0;
		
		for(int i=0;i<arr.length;i++)
		{
			next=-1;
			//if in array next greater element is present the show other waise its show -1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) {
					next=arr[j];
					break;
				}
			}
			System.out.println(arr[i]+":  NEXT Greater Element is  :"+next);
		}
		
		
	}

}
