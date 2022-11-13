/*Write a Java program to retrieve an element (at a specified index) from a given array list*/	


import java.util.*;
class CQ3{	
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
		System.out.println("Retrieving element at first position:");
		System.out.println("First Element: " +colors.get(0));
		System.out.println("Retrieving element at last position:");
		System.out.println("Last Element: " +colors.get(6));
	}
}