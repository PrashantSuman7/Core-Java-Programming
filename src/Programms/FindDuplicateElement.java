package Programms;
class FindDuplicateElement {
public static void main(String[] args) {
	
	int arr[]= {10,50,20,14,14,32,21,21,45};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length-1;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[i]);
//				int temp=arr[i];
//				arr[i]=arr[j];
			}
		}
	}
}
}
