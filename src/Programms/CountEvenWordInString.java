package Programms;
class CountEvenWordInString {
	public static void main(String[] args) {
		
		String str="Arashant";
		String str1=str.toLowerCase();
		int evenChar=countEvenCharacter(str1);
		System.out.println("EvenCharacter :"+evenChar);
	}

	private static int countEvenCharacter(String str1) {
		int count=0;
		int oddCount=0;
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			
				if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
				else
				{
					oddCount++;
				}
			
			
		}
		System.out.println("Consonent :"+oddCount);
		return count;
	}

}
