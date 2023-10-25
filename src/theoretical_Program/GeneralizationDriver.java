package theoretical_Program;

class GeneralizationDriver {

	public static void main(String[] args) 
	{
		Vegetable v1=new Tamato(150,3.5f,"HYRIDE TAMATO", "RED", 200);
		
	// v1===>Object reference of parent type.
		
//v1.tamatoDetails();===> with the help of parent class reference object
						// we can not access the child class data members
						//Disadvantage of up casting to OverCame this 
						//We need to go for down Casting
		
		Tamato t1=(Tamato) v1;
		t1.tamatoDetails();
		
		Vegetable v2=new Patato("HYRIDE PATATO", "BROWN     ", 200);
		Patato p= (Patato)v2;
		p.patatoDetails();

	}

}

class Vegetable
{
	String type;
	String color;
	double price;
	
	
	Vegetable(String type , String color , double price)
	{
		this.type=type;
		this.color=color;
		this.price=price;
	}
	
}

class Tamato extends Vegetable
{
	int quantity;
	float calories;
	
	Tamato(int quantity , float calorise , String type , String color , double price)
	{
		super(type,color,price);
		this.calories=calorise;
		this.quantity=quantity;
	}
	
	public void tamatoDetails()
	{
		System.out.println("-----------Tamato Details------------");
		System.out.println("The type of the Tamato is :"+type);
		System.out.println("The color of the Tamato is :"+color);
		System.out.println("The Price of the Tamato is :"+price);
		System.out.println("The Quantity of the Tamato is :"+quantity);
		System.out.println("The calories of the Tamato is :"+calories);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
}

class Patato extends Vegetable
{
	
	Patato( String type , String color , double price)
	{
		super(type,color,price);
	}
	
	public void patatoDetails()
	{
		System.out.println("-----------Patato Details------------");
		System.out.println("The type of the Tamato is :"+type);
		System.out.println("The color of the Tamato is :"+color);
		System.out.println("The Price of the Tamato is :"+price);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
}

