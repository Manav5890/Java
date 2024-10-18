class Arrayq3{
	public static void main(String [] args){
		char [] ch = {'A','E','I','O','U'};

		
		for(int i =0; i <= ch.length-1;i++){
			System.out.println(ch[i]);
		}
		System.out.println();

		
		for(int j =ch.length-1; j >= 0;j--){
			System.out.println(ch[j]);
		}
		System.out.println();

	
		int k = 0;
		while(k <= ch.length-1){
			System.out.println(ch[k]);
			k++;
		}
		System.out.println();

		
		int l = ch.length-1;
		while(l >= 0){
			System.out.println(ch[l]);
			l--;
		}
		System.out.println();

		
		int m = 0;
		do{
			System.out.println(ch[m]);
			m++;
		}while(m <= ch.length-1);
		System.out.println();

		
		int n = ch.length-1;
		do{
			System.out.println(ch[n]);
			n--;
		}while(n >= 0);
		System.out.println();


		for(char s : ch){
			System.out.println(s);
		}
	}
}