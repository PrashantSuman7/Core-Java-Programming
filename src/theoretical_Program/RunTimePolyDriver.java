package theoretical_Program;

class RunTimePolyDriver {
	public static void main(String[] args) {
		//parent class object refrence and child class object
		//with the help of parent class reference we can access only parent class members..
		SwiftDesire desire = new SuzukiService(); // GEneralization or Up casting
		// desire==object reference of parent class....
		desire.travling();
		System.out.println("-----------------------------");
		SuzukiService service=new SuzukiService();
		service.travling();
		
		System.out.println("-----------------------------");
		
		SwiftDesire ss=new SwiftDesire();
		ss.travling();  
		
	}

}

class SwiftDesire {
	String color;

	public void travling() {
		System.out.println("Hey Customer u can take Drive !");
	}
}

// Is-A relationship
//Child Class
class SuzukiService extends SwiftDesire {

	// method overriding==> give new Implementation
	public void travling() {
		System.out.println("Hey Customer u can not take Drive !");
	}
}
