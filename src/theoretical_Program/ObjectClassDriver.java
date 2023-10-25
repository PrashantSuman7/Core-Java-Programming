package theoretical_Program;

 class ObjectClassDriver {
	 
	 public static void main(String[] args)
	 
	 {
		Aeroplane aeroplane1=new Aeroplane("AIR INDIA", "White", 100, 200);
		// areplane===>object reference;
		Aeroplane aeroplane2=new Aeroplane("AIR INDIA", "White", 101, 200);
		System.out.println(aeroplane1);
		System.out.println("______________________________________");
		System.out.println(aeroplane1);
		System.out.println("______________________________________");
		System.out.println("______________________________________");
		System.out.println("______________________________________");
		System.out.println("______________________________________");
		System.out.println(aeroplane1.equals(aeroplane2));
		
		System.out.println(aeroplane1.hasCode());
		System.out.println(aeroplane2.hasCode());
	 }

}
 
 class Aeroplane
 {
	 String brand;
	 String color;
	 int noofpassengers;
	 int nooftickets;
	public Aeroplane(String brand, String color, int noofpassengers, int nooftickets) {
		this.brand = brand;
		this.color = color;
		this.noofpassengers = noofpassengers;
		this.nooftickets = nooftickets;
	}
	
	
//	@Override
//	public String toString() {
//		return "Aeroplane [brand=" + brand + ", color=" + color + ", noofpassengers=" + noofpassengers
//				+ ", nooftickets=" + nooftickets + "]";
//	}

//method overriding to new implementation
	public String toString()
	{
		return "Aeroplane [Brand : " + brand + " , Color :" + color + " , No of passengers :" + noofpassengers + ", No of tickets :" + nooftickets + "]";	
	}
	//
	public boolean equals(Object o)
	{
		//down casting
		Aeroplane aeroplane=(Aeroplane)o;
		return this.brand.equals(aeroplane.brand)&& this.color.equals(aeroplane.color) && this.noofpassengers==aeroplane.noofpassengers && this.nooftickets==aeroplane.nooftickets;
		
	}
	// method overriding ---new implementation
	// inserted of returning the unique 
	public int hasCode()
	{
		int hc1=brand.hashCode();
		int hc2=color.hashCode();
		int hc3=noofpassengers;
		int hc4=nooftickets;
		return hc1+hc2+hc3+hc4;	
	}
	
	
	public void travelling()
	{
		System.out.println("Have a safe Flight!");
	}
	 
 }
