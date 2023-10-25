package Programms;
class LeftRotation {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		int res[]=new int[arr.length];
		
		int x=0;
		int shift=2;
		
		for(int i=shift;i<arr.length;i++)
		{
			res[x++]=arr[i];
		}
		for(int i=0;i<shift;i++)
		{
			res[x++]=arr[i];
		}
		for(int j=0;j<res.length;j++)
		{
			System.out.println(res[j]);
		}
	}

}
