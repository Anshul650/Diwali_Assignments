/*Write a Java program to check whether a map contains key-value mappings (empty) or not*/

import java.util.*;
class CQ24{
	
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
		boolean result = map1.isEmpty();
		if(result == true){
			System.out.println("HashMap is empty!");
		}else{
			System.out.println("HashMap is not empty!");
		}	
	}
}	

