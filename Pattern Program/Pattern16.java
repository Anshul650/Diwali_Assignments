
public class Pattern16 
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=12;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=10;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=-2;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
			
		for(int i=0;i<5;i++)
		{
			for(int j=8;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=-4;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=-6;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=-8;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=8;j>0;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
