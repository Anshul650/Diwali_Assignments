// Write a program to print elements of Array ?

import java.util.Scanner;
class yourArr
{

  public static void main(String args[])
   
   {
       Scanner obj = new Scanner(System.in);
	   System.out.println("Enter the size of array you want");
    	int size = obj.nextInt();
	   int arr [] = new int[size];
	    
	   System.out.println("Enter elements of array");
	   for(int i = 0;i<size;i++)
      {
           	  arr [i] = obj.nextInt();
	   }
	   
	   
	    System.out.println("Elements of array are");
	   for(int i = 0;i<size;i++)
      {
           	 System.out.println(arr[i]);
			 
	   }
	}
}	
	   