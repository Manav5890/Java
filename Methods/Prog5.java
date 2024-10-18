class Prog5{
	public static void main(String [] args){
	
	// Program5 d  = new Program5();
	Uppercase('A');
	lowercase('a');


}

	public static char Uppercase(char ch){
		if((ch>='A' && ch<='Z')){
		System.out.println("It is UpperCase char");
			
	}

		return ch;
}
	public static char lowercase(char a){
		if((a>='a' && a<='z')){
		System.out.println("It is LowerCase char");
			
	}else{
		System.out.println("Its is invalid Char");
	}
		return a;
}



}