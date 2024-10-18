class arrayq1{

	public static void main(String[] args){
	
		long [] l= {5234343,6234343,4434343};

		  for(int i  = 0; i<l.length; i++){

		System.out.println(l[i]);
		
		}
	
	
		 for (int j = l.length-1; j>=0; j--){
			System.out.println(l[j]);

		} 
		
		int k = 0;
		while(k<l.length){

			System.out.println(l[k]);
			k++;
			}

		int m = 0;
		do{

		System.out.println(l[m]);
		m++;
		
		}while(m<l.length);
		
		for(long a : l){
			System.out.println(a);		
}
			

}





}