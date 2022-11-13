import java.util.Scanner;

class MathOperation 
{
    int a, b;

    MathOperation() 
	{
        a = 0;
        b = 0;
    }

    static int addition(int a, int b) 
	{
        return a + b;
    }

    static int subtract(int a, int b) 
	{
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        return max - min;
    }

    static int Multiplication(int a, int b)
	{
        return a * b;
    }

    static int power(int a, int b)
	{
        return (int) Math.pow(a, b);
    }


}

public class Q7 
{
    public static void main(String[] args) 
	{
        int a, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = sc.nextInt();
        System.out.println("Enter the second number : ");
        b = sc.nextInt();
        System.out.println(MathOperation.addition(a, b));
        System.out.println(MathOperation.subtract(a, b));
        System.out.println(MathOperation.Multiplication(a, b));
        System.out.println(MathOperation.power(a, b));
    }
}