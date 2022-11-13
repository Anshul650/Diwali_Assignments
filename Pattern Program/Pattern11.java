class Pattern11
{
	public static void main(String[] args)
	{
		for(int i=6; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
		
		for(int i=2; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}
}


/*

A B C D E F
A B C D E
A B C D
A B C
A B
A
A B
A B C
A B C D
A B C D E
A B C D E F

*/