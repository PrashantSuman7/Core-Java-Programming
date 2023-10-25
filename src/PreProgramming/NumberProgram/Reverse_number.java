package PreProgramming.NumberProgram;
 class Reverse_number {
	 public static void main(String[] args) {
		int num=1234;
		int temp=num;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("Palindrom Number ");
		}else {
			System.out.println("Not a Palindrom Number :");
		}
	}

}
