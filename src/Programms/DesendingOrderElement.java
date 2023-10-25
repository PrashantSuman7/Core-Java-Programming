package Programms;


class DesendingOrderElement {
public static void main(String[] args) {
	
	int arr[]= {10,50,20,14,32,21,45};
	
	
	for(int i=0;i<arr.length;i++)
	{
		//Arrays.sort(arr);
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	}
	for(int j=0;j<arr.length;j++) {
		System.out.println(arr[j]);
	}
}
}
