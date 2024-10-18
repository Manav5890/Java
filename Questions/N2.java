class N2{
		public static void main(String [] args)
		{
			int n = 5649;
			int p = 1;
			
			while(n!=0)
			{
				int rem = n%10;
				p = p*rem;
				
				
				n = n/10;
			}
				System.out.println(p);

			
		}
}