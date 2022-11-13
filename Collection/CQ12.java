/*Write a Java program to check if a particular element exists in a linked list.*/


import java.util.*;
class CQ12{
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
		System.out.println("Enter a color you want to check if it's exists on the list:");
		String col = sc.nextLine();
		if(colors.contains(col)){
			System.out.println(col + " exists on the linked list.");
		}	
		else{
			System.out.println(col + " doesn't exist on the linked list.");
		}	
	}
}	
		