package theoretical_Program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ReadingDataFromFile {
	public static void main(String[] args) {
		
		try {
			FileInputStream file=new FileInputStream("C:\\Users\\SUMAN\\Desktop\\filehandling.txt");
			int res=file.read();
			while(res !=-1)
			{
				System.out.print((char)res);
				res=file.read();
			}
		
		} catch (FileNotFoundException e) 
		{
			System.out.println("File Not Present In Paticular Path");
		} catch (IOException e)
		{
			System.out.println("There is some problem in reading a file");
		}
		
		
	}

}
