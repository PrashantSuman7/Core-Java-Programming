package theoretical_Program;
class AbsDriver extends obile {
	public static void main(String[] args) {
		
		AbsDriver a=new AbsDriver();
		a.calling();
	}

	@Override
	void calling() {
	System.out.println("This Method is use for Calling");	
	}
}

abstract class obile{
	
	abstract void calling();
}