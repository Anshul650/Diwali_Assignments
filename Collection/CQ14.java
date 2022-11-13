/*Write a Java program to replace an element in a linked list.*/

import java.util.*;
class CQ14{
	public static void display(List<String> mylist)
	{	
		System.out.println("-------------------------------------");
		for(String c : mylist){
			System.out.println(c);
		}
	}	
	public static void main(String[] args){
		
		List<String> colors = new LinkedList<>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Violet");
		colors.add("Indigo");
		display(colors);
		System.out.println("\nNow Replacing Green with Black:");
		colors.set(2,"Black");
		display(colors);
	}
}	