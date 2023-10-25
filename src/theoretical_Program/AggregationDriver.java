package theoretical_Program;

 class AggregationDriver 
 {

	public static void main(String[] args)
	{
		
		Mobile mobile=new Mobile("Samsung", "black", 20000, 8);
		mobile.mobileDetails();
		//callin helper method to pass the values for sim class non static variable;
		mobile.insertSim(99346232, "Airtel");
		mobile.sim.simDetails();
		mobile.removeSim();
		mobile.insertSim(99346232, "jio");
		mobile.sim.simDetails();

	}

}
 //Dependent Class......
 class Sim
 {
	 long simno;
	 String serviceprovider;
	 // Constructor to load all nonstatic variable inside the  object
	 Sim(long simno , String serviceprovider)
	 {
		 this.simno=simno;
		 this.serviceprovider=serviceprovider;
	 }
	 //method to print all the details...
	 public void simDetails()
	 {
		 System.out.println("----------Sim Details-------------");
		 System.out.println("Serviceprovider is  :"+serviceprovider);
		 System.out.println("sim Number is  :"+simno);
		 System.out.println("====================================");
	 }
 }
 //another class
 class Mobile
 {
	 String brand;
	 String color;
	 double price;
	 int ram;
	 Sim sim; //Dependent Class Variable
	 // creating a sim slot to 
	public Mobile(String brand, String color, double price, int ram)
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.ram = ram;
	}
	public void insertSim(long simno, String serviceprovider)//Helper Method ...non static method....Parameterize method
	{
		sim=new Sim(simno , serviceprovider); // inserting sim in slot.
		
		System.out.println("Sim got inserted Successfully!");
	}
	
	public void removeSim()  // no argument method .... non static method
	{
		sim=null; // removing sim.
		
		System.out.println("Sim got removed Successfully !");
	}
	 
	public void mobileDetails()
	{
		System.out.println("-----------Mobile Details-------------");
		System.out.println("Brand is  :"+brand);
		System.out.println("color of  :"+color);
		System.out.println("Price is "+price);
		System.out.println("Ram inside this Mobile is :"+ram);
		System.out.println("==========================================");
	}
	
	
	 
 }

                                                                                                                                                                                                                                                 
