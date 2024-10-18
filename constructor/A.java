class A
{


	public A(){

	}
	 A(String a){
		System.out.println(a);
	}
	 A(int a){
		System.out.println(a);
	}
	 A(float a){
		System.out.println(a);
	}
	 A(byte a){
		System.out.println(a);
	}
	 A(short a){
		System.out.println(a);
	}
	 A(char a){
		System.out.println(a);
	}
	public static void main(String [] args)
	{
		A b = new A("dev");
		A c = new A(5);
		A d = new A(5.5f);
		A e = new A((byte) 4);
		A f = new A((short) 6);
		A g = new A('s');
	}
}