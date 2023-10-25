package Programms;
class RightRotation {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		int res[]=new int[arr.length];
		int x=0;
		int shift=2;
		for(int i=arr.length-shift;i<arr.length;i++) {
			res[x++]=arr[i];
		}
		for(int i=0;i<arr.length-shift;i++)
		{
			res[x++]=arr[i];
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(res[j]+" ");
		}
	}

}
