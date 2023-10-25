package Programms;

 class Methods {
	// no arguments method
	public static void display()// no argument method.
	{
		System.out.println("Hello from no argument display() !");
	}

	 public static void set()
	 {
		 System.out.println("Hello from no argument method set() !");
	 }
	 // purpose of the main method
	 // start the execution
	 // control the flow the execution
	 // end the execution
	 public static void main(String[] args) {
		System.out.println("START");
		 display();// method call statement
		 set();
		 pMethod(1, "Prashant");
		 int res=apple(10, 20);
		System.out.println(res);
		 System.out.println("STOP");
	}
	 
	 // Parameterize method
	 public static void pMethod(int a , String name)
	 {
		 System.out.println(a+"    "+name);
	 }
	 
	 public static int apple(int x , int y)
	 {
		 return x+y;
	 }
	

}
