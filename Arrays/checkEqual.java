// Write a Java program to check the equality of two arrays?


import java.util.Scanner;
class checkEqual
{

  public static void main(String args[])
   
   {
       Scanner obj = new Scanner(System.in);
	   System.out.println("Enter the size of 1st array you want to compare");
    	int a = obj.nextInt();
		
		System.out.println("Enter the size of 2nd array you want to compare");
		int b = obj.nextInt();
		
	  
		
		if (a!=b)
		{
		    System.out.println("Array is not equal");
		}	
		
	else  
	    {
				int P [] = new int[a];
				int Q [] = new int[b];
	    
	   System.out.println("Enter elements of array P");
	   for(int i = 0;i<a;i++)
      {
           	 P [i] = obj.nextInt();
	  }
	   
	   
	    System.out.println("Enter elements of  array Q");
	   for(int i = 0;i<b;i++)
      {
           	 Q [i] = obj.nextInt();
	  }
	   
	   for(int i = 0;i<a;i++)
	  {
	     if (P [i] != Q [i])
		 
		    {System.out.println("Array is not equal");
		        break;
		    }
	  }
		
		      System.out.println("Array is  equal");
		      
		}
	   
	   }
} 

/*
import java.util.Arrays;
  
public class CheckArraysEqual {
    public static void main(String[] args)
    {
        // Initializing the first array
        int a[] = { 30, 25, 40 };
  
        // Initializing the second array
        int b[] = { 30, 25, 40 };
  
        // store the result
        // Arrays.equals(a, b) function is used to check
        // whether two arrays are equal or not
        boolean result = Arrays.equals(a, b);
  
        // condition to check whether the
        // result is true or false
        if (result == true) {
            // Print the result
            System.out.println("Two arrays are equal");
        }
        else {
            // Print the result
            System.out.println("Two arrays are not equal");
        }
    }
}
   */