class Program2{
	public static void main(String [] args){
	
	//Program2 d  = new Program2();
	//d.UppercaseVowel('A');
	UppercaseVowel('A');

}

	public static void UppercaseVowel(char ch){
		if((ch>='A' && ch<='Z') && ch == 'A' || ch== 'E' || ch== 'I' || ch== 'O' || ch== 'U'){
		System.out.println("It is UpperCase Vowel");
			
	}else{
		System.out.println("Not a Uppercase Vowel");
	}



}



}