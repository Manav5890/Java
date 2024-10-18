class Program4{
	public static void main(String [] args){
	
	Program4 d  = new Program4();
	d.sqr(20);


}

	public static void sqr(int num){
		int b = num*num;
		System.out.println("The Sqr of Number is" + b);
		if(b%5==0){
		System.out.println("It is Divisble");
			
	}else{
		System.out.println("Its not divisble");
	}



}



}