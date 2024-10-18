class Program5{
	public static void main(String [] args){
	
	Program5 d  = new Program5();
	d.Uppercase('A');
	d.lowercase('a');


}

	public static void Uppercase(char ch){
		if((ch>='A' && ch<='Z')){
		System.out.println("It is UpperCase char");
			
	}


}
	public static void lowercase(char a){
		if((a>='a' && a<='z')){
		System.out.println("It is LowerCase char");
			
	}else{
		System.out.println("Its is invalid Char");
	}

}



}