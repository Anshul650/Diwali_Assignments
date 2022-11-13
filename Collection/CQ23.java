/*Write a Java program to convert a priority queue to an array containing all of the
elements of the queue*/

import java.util.*;
class CQ23{
	
	public static void main(String[] args){
		
		Queue<String> colors1 = new PriorityQueue<>();
		colors1.add("Blue");
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Yellow");
		colors1.add("Orange");
		colors1.add("Violet");
		colors1.add("Indigo");
		System.out.println("------------------------");
		System.out.println("PriorityQueue: " +colors1);
		System.out.println("\nThe array is:");
		String[] arr = new String[5];
		String arr1[] = colors1.toArray(arr);
		for(String c : arr1){
			System.out.println(c);
		}
	}
}	