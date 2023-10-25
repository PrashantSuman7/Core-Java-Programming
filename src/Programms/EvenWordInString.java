package Programms;
class EvenWordInString {
	public static void main(String[] args) {
		
		String str="Hell word";
		
		for(String s:str.split(" "))
		{
			if(s.length()%2==0)
			{
				System.out.println(s);
			}
		}
	}

}
