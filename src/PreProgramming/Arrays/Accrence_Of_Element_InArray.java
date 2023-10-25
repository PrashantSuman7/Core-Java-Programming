package PreProgramming.Arrays;
class Accrence_Of_Element_InArray {
	
	public static void main(String[] args) {
		int arr[]= {10,20,0,10,20,2,10};
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=Integer.MAX_VALUE;
				}
			}
			if(arr[i]!=Integer.MAX_VALUE) {
				System.out.println(arr[i]+"  || "+count);
			}
		}
	}

}
