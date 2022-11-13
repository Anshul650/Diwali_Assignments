/*Write a Java program to convert a hash set to an array.*/

import java.util.*;
class CQ17{
	
	public static void main(String[] args){
		
		Set<String> colors = new HashSet<>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Violet");
		colors.add("Indigo");
		System.out.println("HashSet: " +colors);
		String col[] = new String[colors.size()];
		colors.toArray(col);
		System.out.println("\nAfter converting Hashset to Array:");
		for(String c : col){
			System.out.println(c);
		}
	}
}	