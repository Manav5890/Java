class Q3{
	public static void main(String[] args){
	
	char b = manav(10.5f, true, 20.5);
	System.out.println(b);


}

	public static char manav(float num, boolean a, 	double d){
	if (a) {
            return 'Y'; 
        } else if (num > d) {
            return 'G';         } 
	else {
            return 'N'; 
        }			
		
	}
	
	


}   