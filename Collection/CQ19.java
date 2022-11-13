/*Write a Java program to create a new tree set, add some colors (string) and print out the
tree set.*/

import java.util.*;
class CQ19{
	
	public static void main(String[] args){
		
		Set<String> colors1 = new TreeSet<>();
		colors1.add("Blue");
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Yellow");
		colors1.add("Orange");
		colors1.add("Violet");
		colors1.add("Indigo");
		System.out.println("TreeSet1: " +colors1);
	}
}	