class Sw4
{
	public static void main(String [] args)
{
	char c = 'a';

	if(c >= 'a' && c <= 'z')
	{

		switch (c) {
			case 'a':
			System.out.println("Vowel");
			break;
			case 'e':
			System.out.println("Vowel");
					break;
			case 'i':
			System.out.println("Vowel");
			break;
			case 'o':
			System.out.println("Vowel");
			break;
			case 'u':
			System.out.println("Vowel");
			break;
	 
			default:
			System.out.println("Consonant");
	
		}
	}
	else{
	System.out.println("Invalid");
	}
}
}