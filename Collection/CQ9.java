/*Write a Java program to insert the specified element at the specified position in the linked
list.*/

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
		System.out.println("At what position you want to add a new color :");
		int pos = sc.nextInt();
		colors.add(pos,"White");
		for(int i = 0; i < colors.size(); i++){
			System.out.println("Element at position " +i+ " is : " +colors.get(i));
		}
	}
}	
	