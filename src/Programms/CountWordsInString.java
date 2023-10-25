package Programms;
class CountWordsInString {
	public static void main(String[] args) {
		String str="prashant Kumar Upadhyay From Siwan BIhar";
		
		int count=countWordsInString(str);
		System.out.println(count);
	}

	private static int countWordsInString(String str) {
		int count=0;
		if(str.charAt(0)!=' ')
		{
			count++;
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		return count;
	}

}
