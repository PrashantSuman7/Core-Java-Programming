package theoretical_Program;
class Construction_Chaning {
	String name;
	String color;
	int price;
	double weight;
	
	
	public Construction_Chaning()
	{
		System.out.println("This is Constructor Chaining");
	}
	
	public Construction_Chaning(String name)
	{
		this.name=name;
	}
	public Construction_Chaning(String name , String color)
	{
		this.name=name;
		this.color=color;
	}
	public Construction_Chaning(String name , String color , int price)
	{
		this(name,color);
		this.price=price;
	}
	public Construction_Chaning(String name , String color , int price, double weight)
	{
		this(name,color,price);
		this.weight=weight;
	}
	

	public static void main(String[] args) {
		Construction_Chaning cn=new Construction_Chaning();
		
		
		Construction_Chaning chaning=new Construction_Chaning("Mango");
		Construction_Chaning chaning1=new Construction_Chaning("Mango","Green");
		Construction_Chaning chaning2=new Construction_Chaning("Mango","Green",250);
		Construction_Chaning chaning3=new Construction_Chaning("Mango","Green",250,2.5);
		
	System.out.println(chaning3.name+" "+chaning3.color+" "+chaning3.price+" "+chaning3.weight);

	}

}
