package theoretical_Program;

class SpecilizationDriver {
	public static void main(String[] args) {
		Child1 child1 = new Child1(null, 0, 0); // instantiation // Specialization
		// we can access the child class members using child class Object.....
		System.out.println(child1.y);
		child1.display();
		// with the help of child class object reference we can access parent class data
		// members
		System.out.println(child1.x);
		System.out.println(child1.a);
		child1.setting();

		// System.out.println(child1.b); // we can't access private members....

		// we can not accces chile class members by using parent class object
		// reference.....

	}

}

// parent class
class Parent1 {
	// non static attributes
	String x;
	int a;
	private int b;

	Parent1(String x, int a) {
		this.x = x;
		this.a = a;
	}

	public void setting() // non static method
	{
		System.out.println("Hello From Parent Class!");
	}
}

// is a relationship/ Inheritance
class Child1 extends Parent1 {
	Child1(String x, int a, double y) {
		super(x, a);
		this.y = y;
	}

	double y;

	public void display() {
		System.out.println("Hello From Child Class !");
	}
}
