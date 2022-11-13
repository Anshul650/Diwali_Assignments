/*Write a Java program to get the value of a specified key in a map*/

import java.util.*;
class CQ25{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(1,"Blue");
		map1.put(2,"Red");
		map1.put(3,"Green");
		map1.put(4,"Yellow");
		map1.put(5,"Orange");
		map1.put(6,"Violet");
		map1.put(7,"Indigo");
		//System.out.println("\nHashMap: " +map1);
		System.out.println("Enter an index which you want to get element from: ");
		int i = sc.nextInt();
		String value = (String)map1.get(i);
		System.out.println("The element at index " +i+ " is: " +value+ "\n");
	}
}	
		