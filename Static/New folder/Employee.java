class Employee3{
	static String company_name = "TYSS";
	String ename;
	int eid;
	double salary;
	int dno = 40;
	{
		System.out.println("Welcome To" + company_name);
		System.out.println("!!! JOB VACANY IS THERE !!!");
		System.out.println("!!! Refer Your Friend For Get Place !!!");
		
	}
	public void printDetails()
	{
		System.out.println(eid);
		System.out.println(salary);
	
	}
	{
		System.out.println("Welcome To Dept No" + dno);
		System.out.println(ename);
		System.out.println(eid);
		System.out.println(salary);	
	
		
	}

	public static void main(String[] args){
	Employee3 e1 = new Employee3();
	Employee3 e2 = new Employee3();
	String ename = "Rajib";
	System.out.println(ename);
	System.out.println(e2.eid);
	System.out.println(e1.salary);
	e1.salary = 78;
	e2.salary = 67;
	e1.printDetails();
	e2.printDetails();


}




}