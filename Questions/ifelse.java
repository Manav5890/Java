class ifelse{
	public static void main(String[] args){
	int num = 6;
	if (num < 5){
		System.out.println("number is less than 5");
	}
	else{
		System.out.println("number is greater than 5");

	}
	if (num>5){
		System.out.println("number is greater than 5");
	}
	else{
		System.out.println("number is less than 5");

	}
	if(num==0){
		System.out.println("number is 0");
	}
	else{
		System.out.println("number is not 0");

	}

	if(num!=0){
		System.out.println("number is not 0");
	}
	else{
		System.out.println("number is 0");

	}
	if(num>0){
		System.out.println("number is positive");
	}
	else{
		System.out.println("number is negative");

	}
	if(num<0){
		System.out.println("number is negative");
	}
	else{
		System.out.println("number is positive");

	}
	if(num%3==0){
		System.out.println("number is divisible 3");
	}
	else{
		System.out.println("number is not divisible by 3");

	}
	if(num%2!=0){
		System.out.println("number is not divisible by 2");
	}
	else{
		System.out.println("number is divisible by 2");

	}
	if(num>10&&num<2){
		System.out.println("number is greater than 10 and less than 2");
	}
	else{
		System.out.println("number is not greater than 10 and less than 2");

	}
	if(num>5&&num<51){
		System.out.println("number is greater than 5 and less than 51");
	}
	else{
		System.out.println("number is not greater than 5 and less than 51");

	}
	if(num%5==0){
		System.out.println("number is divisible by 5");
	} 
	else{
		System.out.println("number is not divisible by 5");

	}
	if(num%2==0&&num%3==0){
		System.out.println("number is divisible by 6");
	}
	else{
		System.out.println("number is not divisible by 6");

	}
	char ch = 'S';
	if(ch=='A'){
		System.out.println("character is A.");
	}
	else{
		System.out.println("character is not A");

	}

	if(ch =='A'|| ch =='a'|| ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'){
		System.out.println("character is vowel");
	}
	else{
		System.out.println("character is not vowel");

	}

	if((ch>='A'&& ch<='Z' || ch>='a'&& ch<='z')&&(ch !='A'|| ch !='a'|| ch!='E'||ch!='e'||ch!='I'||ch!='i'||ch!='O'||ch!='o'||ch!='U'||ch!='u')){
		System.out.println("character is consonant");
	}
	else{
		System.out.println("character is not consonant");

	}
	if(ch =='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'){
		System.out.println("character is uppercase vowel");
	}
	else{
		System.out.println("character is not uppercase vowel");

	}
	if(( ch>='a'&& ch<='z')&&( ch !='a'|| ch!='e'||ch!='i'||ch!='o'||ch!='u') ){
		System.out.println("character is lowercase consonant");
	}
	else{
		System.out.println("character is not lowercase consonant");

	}
	if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		System.out.println("character is lowercase vowel");
	}
	else{
		System.out.println("character is not lowercase vowel");

	}
	if((ch>='A'&& ch<='Z')&&(ch !='A'|| ch!='E'||ch!='I'||ch!='O'||ch!='U') ){
		System.out.println("character is uppercase consonant");
	}
	else{
		System.out.println("character is not uppercase consonant");

	}
	if(ch == 'e'){
		System.out.println("character is e");
	}
	else{
		System.out.println("character is not e");

	}
	if(ch>='A'&& ch<='Z'){
		System.out.println("character is uppercase");
	}
	else{
		System.out.println("character is not uppercase");

	}
	if(ch>='a'&& ch<='z'){
		System.out.println("character is lowercase");
	}
	else{
		System.out.println("character is not lowercase");

	}


	}
}