class Activity9 
 {
      public static void main(String[] args) {
      int num=7;
      System.out.println(num<5 ? "number more than 5" : "number less than 5");
      System.out.println(num>5 ? "number more than 5" : "number less than 5");
      System.out.println(num==0 ? "number is 0" : "number not 0");
      System.out.println(num!=0 ? "number is not equal to 0" : "number is number equal to 0" );
      System.out.println(num>=0 ? "Positve" : "Negative" );
      System.out.println(num<=0 ? "Positve" : "Negative" );
      System.out.println(num%3==0 ? "number divisble by 3" : "number not divisble by 3");
      System.out.println(num%2==1 ? "number divisble by 2" : "number not divisble by 2");
      System.out.println(num>10 && num<2 ? "More than 10 " : "Less than 2");
      System.out.println(num>5 && num<51 ? "more than 5" : "Less than 51");
      System.out.println(num%5==0 ?  "Number divisible by 5" : "Number is not divisble  by 5");
      System.out.println(num%2==0 && num%3==0 ? "Number divisble by 6" : "Number is not  divisble by 6");

	char a  ='A';
	System.out.println(a=='A' ? "true" : "false");
	
	char b = 'A';
	System.out.println(b=='a'||b=='e'||b=='i'||b=='o'||b=='u' ? "is lowercase vowel" : "Is upper case vowel");
	
	char c = 'A';
	System.out.println(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' ||b=='A'||b=='E'||b=='I'||b=='O'||b=='U' ? "It is vowel" : "It is consonant");
	
	char d = 'a';
	System.out.println(d >='a' && d <='z' ? "char is lower case" : "char is upper case");

	char e = 'A';
	System.out.println((e>='A'&& e<='Z')&&(e !='A'|| e!='E'||e!='I'||e!='O'||e!='U') ? "is consonant":"is not consonant");

	char f = 'A';
	System.out.println(f>='A'&& f<='Z');

	char ch ='A';
	System.out.println(ch =='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'? "is vowel":"is not vowel");

	char g = 'A';
	System.out.println(g>='a'&& f<='z' ? "Upper case" : "Lower case");
}	
},k l 