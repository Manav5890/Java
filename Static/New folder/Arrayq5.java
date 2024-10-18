class Arrayq5{
	public static void main(String [] args){
		String [] st = {"Manav","Bye","Manav","Hey"};

	
	       	for(int i =0; i <= st.length-1;i++){
		System.out.println(st[i]);
		}
		System.out.println();

		
		for(int j =st.length-1; j >= 0;j--){
			System.out.println(st[j]);
		}
		System.out.println();

	
		
		int k = 0;
		while(k <= st.length-1){
			System.out.println(st[k]);
			k++;
		}
		System.out.println();

		
		int l = st.length-1;
		while(l >= 0){
			System.out.println(st[l]);
			l--;
		}
		System.out.println();

		
		int m = 0;
		do{
			System.out.println(st[m]);
			m++;
		}while(m <= st.length-1);
		System.out.println();

		
		int n = st.length-1;
		do{
			System.out.println(st[n]);
			n--;
		}while(n >= 0);
		System.out.println();

		
		for(String s : st){
			System.out.println(s);
		}
	}
}