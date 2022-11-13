// Write a program to reverse an Array in java . 


import java.util.Scanner;
class reverseArray
{

  public static void main(String args[])
   
   {
       Scanner obj = new Scanner(System.in);
	   System.out.println("Enter the size of array you want");
    	int n = obj.nextInt();
		int arr [] = new int[n];
		
		 System.out.println("Enter the Elements of array you want");
		 
		 for(int i = 0 ; i<n ; i++)
		 {
		    arr [i] = obj.nextInt();
		 }

		
		int temp ;
		for (int i = 0 ; i < n/ 2 ; i++) 
		{
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
		
		
		System.out.println("Reversed array is:");
		for (int j = 0 ; j < n ; j++)
		{
		    System.out.println(arr [j]);
		}
	}
}	