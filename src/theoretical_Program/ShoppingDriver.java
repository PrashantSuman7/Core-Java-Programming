package theoretical_Program;

import java.util.Scanner;

 class ShoppingDriver {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Username :");
		String username=scanner.next();
		System.out.println("Enter the password :");
		String password=scanner.next(); 
		Shopping shopping=new Shopping();
		System.out.println("Enter the No of Product  :");  
		int noofproduct=scanner.nextInt();
		System.out.println("Enter Discount on Product  :");
		double discount=scanner.nextDouble();
		
		 shopping=new Shopping(noofproduct);
		 shopping=new Shopping(noofproduct);
		 
		 shopping.connectAmazon(username, password);
		 shopping.amazon.amazonDetails();
		 
		 shopping.disconnectedAmazon();

	}
 }

	class Amazon {
		String username;
		private String password;

		public String getPassword() {
			return password;
		}

		Amazon(String username, String password) {
			this.username = username;
			this.password = password;
		}

		public void amazonDetails() {
			System.out.println("-----amazon Details------");
			System.out.println("Username  :" + username);
			System.out.println("Password :" + password);
		}

	}

	class Shopping {
		int noofproduct;
		double discount;
		Amazon amazon;
		
		public Shopping() {
			
		}

		Shopping(int noofproduct) {
			this.noofproduct = noofproduct;
		}

		Shopping(double discount) {
			this.discount = discount;
		}

		public void connectAmazon(String username, String password) {
			
			amazon = new Amazon(username, password);

			System.out.println("amazon Connected to Shopping");
		}
		public void disconnectedAmazon() {
			amazon = null;

			System.out.println("Amazon Got Disconnected");
		}

	}

