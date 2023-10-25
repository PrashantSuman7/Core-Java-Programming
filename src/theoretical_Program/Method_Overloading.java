package theoretical_Program;

public class Method_Overloading {

	
	public static void add(int a , int b)
	{
		System.out.println("Integer Type Method");
		System.out.println("Sum "+(a+b));
	}
	
	public static void add(double a , double b)
	{
		System.out.println("decimal type method");
		System.out.println("sum of "+(a+b));
	}
	
	public static void add(int a , int b , double c)
	{
		System.out.println("this is Int ,Int ,Decimal type Addition");
		System.out.println("sum of "+(a+b+c));
	}
	
	public static void main(String[] args) {
		
		add(10 ,20);
		add(10.5,20.7);
		add(50,20,29.99);

	}

}
