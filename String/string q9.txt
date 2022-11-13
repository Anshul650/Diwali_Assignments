import java.util.Scanner;

// Main class
 class run {

    // Main driver method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to be converted to int");
        String str = sc.nextLine();
        int new_str = Integer.parseInt(str);
        System.out.println("after conversion the result is : ");
        System.out.println(new_str);

    }
}