package theoretical_Program;

class UncheckedExceptionEx2 {

	public static void main(String[] args) {
		
		int [] arr=new int [10];
		
		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exception Handled  resone:    Array maximum length is 9");
			
		}
            catch (NullPointerException e) {
			
			System.out.println("Exception Handled  resone:    Arrar maximum length is 9");
			
		}

	}

}
