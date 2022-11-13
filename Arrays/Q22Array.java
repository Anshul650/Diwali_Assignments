import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Q22Array {

	public static void main(String[] args) {

		Integer[] numbers = { 7, 7, 8, 9, 10, 8, 8, 9, 6, 5, 4 };

		/**
		 * To convert an array into a Set, first we convert it into a List using
		 * Arrays.asList method. Next we create a TreeSet and pass the list as
		 * an argument to the constructor.
		 **/
		 	List< Integer > list = Arrays.asList(numbers);

		Set< Integer > set = new TreeSet< Integer >(list);

		// Display elements of the set

		System.out.println("The set contains...");

		for (Integer n : set) {

			System.out.println(n);
		}
	}
}