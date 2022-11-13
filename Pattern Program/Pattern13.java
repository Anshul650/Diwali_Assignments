class Pattern13
{
	public static void main(String[] args)
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(" ");
			}
		
			for(int j=1; j<=i; j++)
			{
				if(j==1 || j==i)
					System.out.print((char)(i+64)+" ");
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=6-i; j++)
			{
				System.out.print(" ");
			}
		
			for(int j=1; j<=i; j++)
			{
				if(j==1 || j==i)
					System.out.print((char)(i+64)+" ");
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}


/*

	 A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A
*/