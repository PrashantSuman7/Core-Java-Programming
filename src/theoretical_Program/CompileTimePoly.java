package theoretical_Program;

class CompileTimePoly 
{
	public static void xyz()
	{
		System.out.println("JSPIDER");
	}
	public static void xyz(String a)
	{
		System.out.println(a+"   JSPIDER" );
	}
	
	public static int xyz(int a , int b)
	{
		System.out.println("-------------------------");
		return a+b;
	}
	
	public static void main(String[] args) {
		
		xyz();
		xyz("HELLO");
		int sum=xyz(10,20);
		System.out.println(sum);
	}

}
