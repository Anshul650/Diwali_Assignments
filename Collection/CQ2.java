/*Write a Java program to insert an element into the array list at the first position.*/

import java.util.*;
class CQ2{
	public static void display(List<String> mylist)
	{	
		System.out.println("-------------------------------------");
		Iterator<String> it = mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args){
		List<String> colors = new ArrayList<>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Violet");
		colors.add("Indigo");
		display(colors);
		colors.add(0,"Black");
		System.out.println("\nList after adding an element at first position:");
		display(colors);
		
	}
}