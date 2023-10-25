package theoretical_Program;

 class EncaptulationDriver 
 {

	public static void main(String[] args) 
	{
		House s=new House();
		//s--> object reference.
		System.out.println("----------House Details-------------");
		System.out.println("The name of the house  :" +s.getName());
		//restrict direct accessing .
		// we need to provide indirect access via methods.
		//printing the hiding data ===>getter().
		// as the data is hidden we can not directly Initialize.
		//we need to call setter method
		s.setName("Suman-Niwash");
		s.setPaintColor("navy-blue");
		s.setCost(523000.012);
		System.out.println("The name of the house  :" +s.getName());
		System.out.println("The color of the house  :" +s.getPaintColor());
		System.out.println("The number of  floor in the house  :" +s.getNoOfFloors());
		System.out.println("The Location of the house  :" +s.getLocation());
		System.out.println("The color of the house  :" +s.getCost());

	}

}
 
 class House
 {
	 private String name;
	 private String paintcolor;
	 private int nooffloors;
	 private String locations;
	 private float dimension;
	 private  double cost;
	 
	 public String getName() //getter() // non static method // no argument methods
	 {
		return name;	 
	 }
	 public void setName(String name)//setter() // non-static method() // parameterize method
	 {
		 this.name=name;
	 }
	 
	 public String getPaintColor()
	 {
		 return paintcolor;
	 }
	 
	 public void setPaintColor(String paintcolor)
	 {
		 this.paintcolor=paintcolor;
	 }
	 
	 public int getNoOfFloors()
	 {
		 return nooffloors;
	 }
	 
	 public String getLocation()
	 {
		 return locations;
	 }
	 
	 public double getCost()
	 {
		 return cost;
	 }
	 public void setCost(double cost)
	 {
		 this.cost=cost;
	 }
 }
