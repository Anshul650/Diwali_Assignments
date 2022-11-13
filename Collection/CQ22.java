/*Write a Java program to count the number of key-value (size) mappings in a map*/

import java.util.*;
class CQ22{
	
	public static void main(String[] args){
		
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(1,"Blue");
		map1.put(2,"Red");
		map1.put(3,"Green");
		map1.put(4,"Yellow");
		map1.put(5,"Orange");
		map1.put(6,"Violet");
		map1.put(7,"Indigo");
		System.out.println("\nHashMap: " +map1);
		System.out.println("\nHashMap Size: " +map1.size());
		System.out.println();
	}
}	