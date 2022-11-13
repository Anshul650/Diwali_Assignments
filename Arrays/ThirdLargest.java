/* Print the third-largest number in an array without sorting it 
Input: [ 24,54,31,16,82,45,67] */

import java.util.*;  
class ThirdLargest
{  
		static int getThirdLargest(Integer[] a, int total)
		{  
					List<Integer> list=Arrays.asList(a);  
					Collections.sort(list);  
					int element=list.get(total-3);  
					return element;  
		}  
		
		
		public static void main(String args[])
		
		{  
			Integer a[]={24,54,31,16,82,45,67};  
			  
			System.out.println("Third Largest: "+getThirdLargest(a,7));  
		
		}
}