class demo_Q11
{
    String name;
    int number;

    demo_Q11(String name,int number)
    {
         this.name = name;
         this.number = number;
    }

    void display()
    {
        System.out.println(" name entered is : "+name);
        System.out.println("number entered is : "+number);
    }

    public static void main(String[] args)
	{
        demo_Q11 d = new demo_Q11("ace",321);
        d.display();
    }
}