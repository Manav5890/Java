class N12{
		public static void main(String [] args)
		{
			int n = 5649;
			
			int cnt = 0;
			
			while(n > 0)
			{
				int rem = n%10;
				if(n%2 == 0){
					cnt++;
				}
				n = n/10;
				
				
			}
			System.out.println(cnt);

			
				

			
		}
}