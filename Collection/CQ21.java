/*Write a Java program to remove all the elements from a priority queue.*/

import java.util.*;
class CQ21{
	
	public static void main(String[] args){
		
		Queue<String> colors1 = new PriorityQueue<>();
		colors1.add("Blue");
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Yellow");
		colors1.add("Orange");
		colors1.add("Violet");
		colors1.add("Indigo");
		System.out.println("PriorityQueue: " +colors1);
		colors1.clear();
		System.out.println("PriorityQueue(After Removing): " +colors1);
	}
}	