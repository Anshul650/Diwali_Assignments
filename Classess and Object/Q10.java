import java.util.*;
 
public class Q10 
{
    public static void main(String[] argv) throws Exception
    {
        try 
		{
            List<String> vector = new ArrayList<String>();

            vector.add("A");
            vector.add("B");
            vector.add("C");
            vector.add("D");
            vector.add("E");
 
            System.out.println("Before swap: " + vector);

            System.out.println("\nTrying to swap elements" + " more than upper bound index ");
            Collections.swap(vector, 0, 5);
 
            System.out.println("After swap: " + vector);
        }
 
        catch (IndexOutOfBoundsException e) 
		{
            System.out.println("Exception thrown : " + e);
        }
    