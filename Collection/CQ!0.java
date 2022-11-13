/*Write a Java program to insert elements into the linked list at the first and last position.*/

import java.util.*;
class CQ9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
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
		colors.addFirst("White");
		colors.addLast("Maroon");
		for(int i = 0; i < colors.size(); i++){
			System.out.println("Element at position " +i+ " is : " +colors.get(i));
		}
	}
}	