class Pattern2
{
	public static void main(String[] args)
	{
		for(int i = 1; i<6; i++)
		{
			if(i == 1)
			{
				for(int j = 1; j<10; j++)
					{
						System.out.print("* ");
					}
					System.out.println();
			}
		    if(i>1)
			{
				for(int j = 1; j<11; j++)
				{
					if(i ==j || (i+j) == 10)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				
				}System.out.println();
			}
			
		}
	}
}



/*
* * * * * * * * *
 *     *
  *   *
   * *
    *

 
 */