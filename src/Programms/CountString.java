package Programms;
 class CountString {
	 public static void main(String[] args) {
		
		 String str="Hello mister Prashant";
		 int count=0;
		 for(int i=0;i<str.length();i++)
		 {
			if(str.charAt(i)!=' ')//without Space or Without space....
			{
				count++;
			}
		 }
		 System.out.println(count);
	}

}
