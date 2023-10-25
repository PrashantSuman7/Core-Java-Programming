package PreProgramming.NumberProgram;
class BiggestNumberInThree_Number {
	
	/*
	 * Largest Number among three numbers By using trnury Operator; 
	 */
	public static void main(String[] args) {
		int a=100,b=20,c=30;
		
		int res=a>b ? (a>c?a:c) : (b>c?b:c);
		int res1=(a>b&&a>c)?a:(b>c)?b:c;
		System.out.println(res+"    "+res1);
	}

}
