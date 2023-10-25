package theoretical_Program;
class MultipleClass implements Jone,James {
	public static void main(String[] args) {
		Jone j=new MultipleClass();
		j.dance();
		System.out.println("=================================");
		
		James jam=new MultipleClass();
		jam.dance();
		
	}

	@Override
	public void dance() {
		System.out.println("This is a Dance Methods");
		
	}

}

 interface Jone
{
	 public static void main(String[] args) {
		System.out.println("this is a Interface Main method");
	}
	void dance();
}

 interface James
 {
	 void dance();
 }