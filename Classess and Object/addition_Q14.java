import java.util.Scanner;

class addition_Q14
{
    void calculation(int n1,int n2 )
    {
        int result = n1+n2;
        System.out.println("the sum of "+n1 +" and "+n2+" is "+result);
    }
	
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("enter the first number ");
        num1 = sc.nextInt();
        System.out.println("enter the second number ");
        num2 = sc.nextInt();
        addition_Q14 add = new addition_Q14();
        add.calculation(num1,num2);

    }
}