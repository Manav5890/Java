class N9{
		public static void main(String [] args)
		{
			int n = 5649;
			int f = 0;
			
			
			while(n>0)
			{
				int rem = n%10;
				int fact = 1;
				while(rem >0){
					fact = fact*rem;
					rem--;
}
			f = f + fact;
				
				
				n = n/10;
			}

			System.out.println(f);
				

			
		}
}