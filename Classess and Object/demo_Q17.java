import java.io.*;

class demo_Q17
{
   int number
   
   demo_Q17()
   {
       System.out.println("the default constructor");
   }
   
   demo_Q17(int x)
   {
       this();
       System.out.println(x);
   }
   
   demo_Q17(int x,int y)
   {
       this(x*y);
       System.out.println(x+y);
   }

    public static void main(String[] args)
	{
       demo_Q17 obj= new demo_Q17(4,5);

    }
}