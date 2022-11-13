/*Write a Java program to sort a given array list.*/

import java.util.*;
class CQ4{
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
		colors.add(0,"Black");
		Collections.sort(colors);
		System.out.println("\nList after sorting: ");
		display(colors);
	}
}	
		