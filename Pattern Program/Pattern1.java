class Pattern1
{
	public static void main(String[] args)
	{
		for(int i = 1; i<6; i++)
		{
		    if(i<5)
			{
				for(int j = 10; j>1; j--)
				{
					if((i+j) == 6 || (j-i) == 4)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				
				}System.out.println();
			}
			else
			{
				for(int j = 1; j<4; j++)
				{
					System.out.print(" * * *");
				}
			}
		}
	}
}