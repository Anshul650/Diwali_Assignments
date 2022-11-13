import java.util.Scanner;

abstract class student 
{
    String name;
    int roll_no;

    abstract void data_entry(String name, int roll_no);

    void display() 
	{
        System.out.println("the name of the student is : " + name);
        System.out.println("the roll number of the student is :" + roll_no);
    }
}

class feed_Q1 extends student 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the student :");
        String name = sc.nextLine();
        System.out.println("enter the roll number of the student :");
        int roll_no = sc.nextInt();
        feed_Q1 s1 = new feed_Q1();
        s1.data_entry(name,roll_no);

    }
	
    void data_entry(String name, int roll_no)
	{
        this.name = name;
        this.roll_no = roll_no;
        display();
    }
}