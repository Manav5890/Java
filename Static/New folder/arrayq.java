class arrayq{

	public static void main(String[] args){
	
		short [] s= {52,62,44};

		  for(int i  = 0; i<s.length; i++){

		System.out.println(s[i]);
		
		}
	
	
		 for (int j = s.length-1; j>=0; j--){
			System.out.println(s[j]);

		} 
		
		int k = 0;
		while(k<s.length){

			System.out.println(s[k]);
			k++;
			}

		int m = 0;
		do{

		System.out.println(s[m]);
		m++;
		
		}while(m<s.length);
	
		for(short o: s){
			System.out.println(m);
		}
		
		
			

}





}