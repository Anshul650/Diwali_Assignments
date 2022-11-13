/*Write a Java program to iterate through all elements in a hash list.*/

import java.util.*;
class CQ15{
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
	}
}	