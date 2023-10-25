package theoretical_Program;

import java.util.Scanner;

class MiniProjectDriver {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("-------------------Welcome--------------------");
		System.out.println("Enter the School Name  :");
		String schname1 = scn.next();
		System.out.println("Enter the Location :");
		String loc = scn.next();
		System.out.println("Enter the Principal name :");
		String princi = scn.next();
		School sch = new School(schname1, loc, princi);

		boolean flag = true;

		while (flag) {
			System.out.println(
					"--------Select your option \n        1.ADMIT STUDENT \n        2.REMOVE STUDENT \n        3.SCHOOL DETAILS  \n        4.STUDENT DETAILS  \n       5.EXIT");
			int option = scn.nextInt();

			switch (option) {
			case 1: {
				sch.admitStudent();
			}
				break;

			case 2: {
				sch.removeStudent();
			}
				break;

			case 3: {
				sch.schoolDetails();
			}
				break;

			case 4: {
				sch.student.studentDetails();
			}
				break;
			case 5: {
				flag = false;
				System.out.println("-----EXIT------");
			}
				break;

			default: {
				System.out.println(" Please!! Enter Valid Option");
			}
				break;
			}
		}
	}
}

class Student {
	private String sname;
	private int sid;
	private long cno;
	private double percentage;

	Student(String sname, int sid, long cno, double percentage) {
		this.sname = sname;
		this.sid = sid;
		this.cno = cno;
		this.percentage = percentage;
	}

	public String getSname() {
		return sname;
	}

	public int getId() {
		return sid;
	}

	public long getCno() {
		return cno;
	}

	public double getPercentage() {
		return percentage;
	}

	public void studentDetails() {
		System.out.println("----------Student Details---------");
		System.out.println("Student name is  :" + sname);
		System.out.println("Student id is  :" + sid);
		System.out.println("Student cno is  :" + cno);
		System.out.println("the percentage secure by the student is  :" + percentage);
		System.out.println("==============================================");

	}

}

class School {
	String name;
	String location;
	String principal;
	Student student; // Dependent class variable
	// create a place inside the school in order to student sit.

	School(String name, String location, String principal) {
		this.name = name;
		this.location = location;
		this.principal = principal;
	}

	public void admitStudent()// helper method
	{
		if (student == null)// validation or verification
		// if the place is empty then admit the student.
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Student name :");
			String name1 = sc.next();
			System.out.println("Enter the Student Id :");
			int id = sc.nextInt();
			System.out.println("Enter the Student Contact Number  :");
			long con1 = sc.nextLong();
			System.out.println("Enter the Percentage secured by the Student :");
			double percentage1 = sc.nextDouble();
			student = new Student(name1, id, con1, percentage1);

			System.out.println("Student got admitted Successfully !");
		} else {
			System.out.println("Addmissions are closed !  better luck next time");
		}
	}

	public void removeStudent() {
		if (student != null)// if place is not empty i.e, Student exists.
		{
			student = null;
			System.out.println("Student got removed Successfully");
		} else {
			System.out.println("Student Dosent exist! so removed student is not Possible");
		}
	}

	public void schoolDetails() {
		System.out.println("-----------School Details-----------");
		System.out.println("The name of School :" + name);
		System.out.println("The Location of the School :" + location);
		System.out.println("The Principal of School :" + principal);
		System.out.println("========================================");
	}
}
