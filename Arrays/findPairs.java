/*  Write a Java program to find all pairs of elements in an integer array whose sum is equal 
to a given number? */


import java.util.Scanner;
class findPairs
{

  public static void main(String args[])
   
   {
       Scanner obj = new Scanner(System.in);
	   System.out.println("Enter the size of array you want");
    	int a = obj.nextInt();
		int arr [] = new int[a];
		
		 System.out.println("Enter the Sum you want");
		 int sum = obj.nextInt();
		 
		 
		 System.out.println("Enter the Elements of array you want");
		 
		 for(int i = 0;i<a;i++)
		 {
		    arr [i] = obj.nextInt();
		 }

       
	     System.out.println("Required pair/pairs is/are");
		 for(int i = 0 ; i < a ; i++ )
		   for(int j = i + 1 ; j < a ; j++ )
		     
		     {   
			       if (arr [i] + arr [j] == sum)
				      
					  {
					     System.out.println(arr [i]+","+arr [j]);
					  }
             }	
	}
}	