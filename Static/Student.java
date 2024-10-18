import java.util.Scanner;

class Student
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Roll No");
        int rollno  = sc.nextInt();
	
	 sc.nextLine();

        System.out.println("Enter Your First Name");
        String firstname = sc.nextLine();


        System.out.println("Enter Your Last Name");
        String lastname = sc.next();

        sc.nextLine();

        System.out.println("Enter Your Address");
        String address = sc.nextLine();

        System.out.println("Enter Your Percentage");
        float per = sc.nextFloat();

        System.out.println("Enter Passing Year");
        int yop = sc.nextInt();

        System.out.println("Passed (Yes/No)");
        boolean result = sc.nextBoolean();

        System.out.println("Roll No: " + rollno);
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Address: " + address);
        System.out.println("Percentage: " + per);
        System.out.println("Year of Passing: " + yop);
        System.out.println("Passed: " + result);
    }
}
