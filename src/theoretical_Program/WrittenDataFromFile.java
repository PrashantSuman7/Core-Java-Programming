package theoretical_Program;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

class WrittenDataFromFile {

	public static void main(String[] args) {
		 try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\SUMAN\\Desktop\\filehandling.txt",true);
		PrintWriter pw=new PrintWriter(fos);
		pw.print("HEllo");
		pw.print("HEllo");
		pw.print("HEllo");
		pw.print("HEllo");
		pw.print("HEllo");
		
		System.out.println("file save Successfuly");
		
		 
		 } catch (FileNotFoundException e) {
			System.out.println("Sorry File not Found");
			e.printStackTrace();
		}

	}

}
