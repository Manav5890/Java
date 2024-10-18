class prog7{
	   public static void main(String [] args) {
	String firstName="Manav";
	String lastName="Gandhi";
        if (firstName.length() > lastName.length()) {
            int square = firstName.length() * firstName.length();
            System.out.println("Square of first name length: " + square);
        } else if(firstName.length() < lastName.length()){
            int cube = lastName.length() * lastName.length() * lastName.length();
            System.out.println("Cube of last name length: " + cube);
        }else{
		System.out.println("It is equal number of length");
		}
    
}




}