import java.util.Scanner;

class addition_Q12
{
    int num1;
    int num2;
	
    addition_Q12(int n1,int n2)
    {
        this.num1= n1;
        this.num2=n2;
    }

    int calculation()
    {
        return num1+num2;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("enter the first number ");
        num1 = sc.nextInt();
        System.out.println("enter the second number ");
        num2 = sc.nextInt();
        addition_Q12 add = new addition_Q12(num1,num2);
        int result = add.calculation();
        System.out.println("the addition_Q12 of two numbers "+result);
    }
}