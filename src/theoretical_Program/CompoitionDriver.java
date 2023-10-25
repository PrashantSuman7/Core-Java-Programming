package theoretical_Program;

class CompositionDriver {

	public static void main(String[] args) 
	{
		
		Car car=new Car("Mercedez", "red", 15621, 5, new Engine(123456, 5000));//early Instantiation
		car.carDetails();
		car.eng.engineDetails();         
	}

}

class Engine//Dependent Class
{
	int engineno;
	int cc;
	
	Engine(int engineno , int cc)
	{
		this.engineno=engineno;
		this.cc=cc;
	}
	
	public void engineDetails()
	{
		System.out.println("--------Engine Details--------");
		System.out.println("This is the EngineNo  :"+ engineno);
		System.out.println("The cc of the engine is  :"+cc);
	}
}
//Another class 
class Car 
{
	String brand;  //Atribut`s
	String color;
	double price;
	int noofseat;
	Engine eng;  // dependent class variable.
	//creating a compartment order to place an Engine
   Car(String brand, String color, double price, int noofseat , Engine eng) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.noofseat = noofseat;
		this.eng=eng;
	}
public void carDetails()
   {
	   System.out.println("----------Car Details----------");
	   System.out.println("The Brand of the car is  :"+brand);
	   System.out.println("The color of the car   :"+color);
	   System.out.println("The price of the car is  :"+price);
	   System.out.println("No of seats in the car is  :"+noofseat);
   }
	
	
}

