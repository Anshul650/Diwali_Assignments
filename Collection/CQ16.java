/*Write a Java program to empty an hash set.*/

import java.util.*;
class CQ16{
	public static void display(Set<String> mylist)
	{	
		System.out.println("-------------------------------------");
		for(String c : mylist){
			System.out.println(c);
		}
	}	
	public static void main(String[] args){
		
		Set<String> colors = new HashSet<>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Violet");
		colors.add("Indigo");
		display(colors);
		colors.removeAll(colors);
		System.out.println("\nAfter removing elements :");
		display(colors);
	}
}	