package Programms;

class countCharByRecursion {
	public static void main(String[] args) {

		String str = "Arashant";
		System.out.println(coutnChar(str.toLowerCase()));
	}

	private static int coutnChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
			}
		}
		
return isEven(str);
	}

	private static int isEven(String str) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		return count;
	}

}
