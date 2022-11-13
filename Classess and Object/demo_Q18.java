import java.io.*;

class demo_Q18
{
   int number;
   
   demo_Q18()
   {
       System.out.println("the default constructor");
   }
   
   demo_Q18(int x)
   {
       this();
       System.out.println(x);
   }
   
   demo_Q18(int x,int y)
   {
       this(x*y);
       System.out.println(x+y);
   }

    public static void main(String[] args) 
	{
       demo_Q18 obj= new demo_Q18(4,5);

    }
}