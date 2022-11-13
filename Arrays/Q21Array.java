import java.util.*;
 
class Q21Array
{
    public static void main (String[] args)
    {
 
        String[] ansha = {"Manan", "Ansh",
                          "Chintu", "Nisha"};
 
        // Conversion of array to ArrayList
        // using Arrays.asList
        List al = Arrays.asList(ansha);
        System.out.println(al);
 
        // Adding some more values to the List.
        al.add("Shashi");
        al.add("Sanket");
 
        System.out.println(al);
    }
}