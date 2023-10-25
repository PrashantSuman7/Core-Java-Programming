package theoretical_Program;
 class Constructor_Overloading {
	String name;
	int price;
	double weight;
	
	public Constructor_Overloading()
	{
		System.out.println("This is Fruit");
	}
	
	public Constructor_Overloading(String name, int price , double weight)
	{
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
	
	public Constructor_Overloading(String name)
	{
		this.name=name;
		System.out.println("Changing Type of Parameter");
	}
	
	public Constructor_Overloading(int price, String name)
	{
		this.price=price;
		this.name=name;
		System.out.println("Changing the sequence of Parameter");
	}
	

	public static void main(String[] args) {
		
		Constructor_Overloading co=new Constructor_Overloading("Mango", 200,2.5);
		Constructor_Overloading co1=new Constructor_Overloading("Orange");
		Constructor_Overloading co2=new Constructor_Overloading(250, "Banana");
		
		 
		System.out.println(co.name+" "+co.price+" "+co.weight);
		
		System.out.println(co1.name);
		System.out.println(co2.price+" "+co2.name);

	}

}
