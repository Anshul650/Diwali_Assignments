class Pattern5
{
	public static void main(String[] args)
	{
		for(int i=1; i<5; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			int k = i;
			for(int j=1; j<=i; j++)
			{
				System.out.print(k);
				k--;
			}
			
			if(i>1)
			{
				for(int j=2; j<=i; j++)
				{
					System.out.print(j);
				}
				
			}
			System.out.println();
		}
		
		
		for(int i=3; i>=1; i--)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			int k = i;
			for(int j=1; j<=i; j++)
			{
				System.out.print(k);
				k--;
			}
			
			if(i>1)
			{
				for(int j=2; j<=i; j++)
				{
					System.out.print(j);
				}
				
			}
			System.out.println();
		}
	}
}


/*

   1
  212
 32123
4321234
 32123
  212
   1

*/