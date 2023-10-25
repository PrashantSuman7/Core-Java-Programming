package Programms;

class FirstElementInEachWord {
	public static void main(String[] args) {

		String str = "rashant Kumar Upadhyay";

		firstCharacterOfWord(str);
	}

	private static void firstCharacterOfWord(String str) {

		String[] word = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			String s=word[i];
			System.out.println(s.charAt(0));

		}

	}

}
