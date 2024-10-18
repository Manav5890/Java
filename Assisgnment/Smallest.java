class Smallest
{
	public static void main(String[] args)
	{
	int num1=4;
	int num2=7;
	int num3=10;
	int small=(num1<num2) ? (num1<num3 ? num1:num3) :(num2<num3 ? num2:num3);
	System.out.println("Smallest number: " + small);
	}
}