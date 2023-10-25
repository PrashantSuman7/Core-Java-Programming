package PreProgramming.Arrays;
class Palindrom_Array {
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,1};
		boolean flag=true;
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++) {
				if(arr[i]==arr[j]) {
					j--;
				}else {
					flag=false;
					System.out.println("Not a palindrom NUmber ");
					break;
				}
			
		}
		if(flag==true) {
			System.out.println("Palindrom Number");
		}
	}

}
