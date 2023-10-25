package theoretical_Program;

public class Paramiterize_Constructor {
		String name;
		String Address;
		int age;
		
		public Paramiterize_Constructor(String n, String add, int a)
		{
			name=n;
			Address=add;
			age=a;
		}
		
		public static void main(String[] args) {
			
			Paramiterize_Constructor paramiterize_Constructor=new Paramiterize_Constructor("Prashant", "Siwan", 25);
			
		System.out.print(paramiterize_Constructor.name+" "+paramiterize_Constructor.Address+" "+paramiterize_Constructor.age );
		}

}
