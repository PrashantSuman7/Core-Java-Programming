package Programms;
class MinMaxLcm {
	public static void main(String[] args) {
		int arr[]= {1,2,3,8};
		
		int max=arr[0];
		int min=arr[0];
		int x=0 , lcm=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum Number In this Arrya is :"+min);
		System.out.println("Maximum Number In this Arrya is :"+max);
		
		for(int k=0;k<arr.length;k++)
		{
			x=k*max;
			if(x%min==0)
			{
				lcm=x;
			}
		}
		System.out.println(lcm);
	}

}
