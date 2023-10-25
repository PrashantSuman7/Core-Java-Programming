package PreProgramming.NumberProgram;
class ProductOfDigit {
	public static void main(String[] args) {
		int num=123;
		int product=1;
		if(num>0) {
			int rem=num%10;
			product*=rem;
			num/=10;
		}
		System.out.println("Product of digit is : "+product);
	}

}
