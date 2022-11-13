// Find out smallest and largest number in a given Array? 

import java.util.*;
class smallLargest
{

public static void main(String args[])
   
   {
		   Scanner obj = new Scanner(System.in);
		   System.out.println("Enter the size of array you want");
		   int n = obj.nextInt();
		   int arr [] = new int[n];
		   
	       System.out.println("Enter the Elements of array you want");
		 
		 for(int i = 0 ; i < n ; i++)
		  {
		      arr [i] = obj.nextInt();
		  }	 

            int small = arr[0];
			int large = arr[0];
		  
		  for(int j = 1 ; j < n ; ++j)
			{
				if(arr[j]>large)
				large=arr[j];

				if(arr[j]<small)
				small=arr[j];
			}

				System.out.println("smallest element is: "+small);
				System.out.println("Largest element is: "+large);
	}
	
}