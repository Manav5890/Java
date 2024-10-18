class prog6{
public static void main(String [] args) {
	int month=11;
        int days;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
		System.out.println("31 days");
                break;
            case 4,6,9,11:
                days = 30;
		System.out.println("31 days");
                break;
            case 2:
                days = 28; 
		System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid month number.");
                
        }
       
    }


	


}