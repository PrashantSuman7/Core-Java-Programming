package theoretical_Program;

public class This_Keyword {
	
	public void test()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		This_Keyword tk=new This_Keyword();
				System.out.println(tk);
				tk.test();
				
				System.out.println("=================");
				This_Keyword tk1=new This_Keyword();
				System.out.println(tk1);
				tk1.test();
				

	}

	

}
