/*Write a Java program to display the elements and their positions in a linked list*/

import java.util.*;
class CQ11{
	public static void main(String[] args){
		
		List<String> colors = new LinkedList<>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Violet");
		colors.add("Indigo");
		for(int i = 0; i < colors.size(); i++){
			System.out.println("Element at position " +i+ " is : " +colors.get(i));
		}
	}
}	