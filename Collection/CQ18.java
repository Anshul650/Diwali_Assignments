/*Write a Java program to compare two sets and retain elements which are same on both
sets*/

import java.util.*;
class CQ18{
	
	public static void main(String[] args){
		
		Set<String> colors1 = new HashSet<>();
		colors1.add("Blue");
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Yellow");
		colors1.add("Orange");
		colors1.add("Violet");
		colors1.add("Indigo");
		System.out.println("HashSet1: " +colors1);
		
		Set<String> colors2 = new HashSet<>();
		colors2.add("Blue");
		colors2.add("Red");
		colors2.add("Yellow");
		colors2.add("Violet");
		System.out.println("HashSet2: " +colors2);
		
		colors1.retainAll(colors2);
		System.out.println("HashSet1: " +colors1);
	}
}	