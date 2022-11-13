
abstract class Publication
 {
    int NoOfPages;
    int Prices;
    String Publisher_Name;

    abstract void set_Publication(int pages, int prices, String publisher_name);

    abstract void get_Publication();

}

class Books extends Publication
{
    Books() 
	{
        this.Prices = 0;
        this.NoOfPages = 0;
        this.Publisher_Name = "";
    }
	
    void set_Publication(int Pages, int Prices, String Publisher_Name)
	{
        this.NoOfPages = Pages;
        this.Prices = Prices;
        this.Publisher_Name = Publisher_Name;
    }

    void get_Publication()
	{
        System.out.println("the price of the book is :" + this.NoOfPages);
        System.out.println("the no of pages in the book is :" + this.Prices);
        System.out.println("the name of the publisher is : " + this.Publisher_Name);
        System.out.println();
    }
}

class Journal extends Publication 
{
    Journal()
	{
        this.Prices = 0;
        this.NoOfPages = 0;
        this.Publisher_Name = "";
    }

    void set_Publication(int Pages, int Prices, String Publisher_Name) 
	{
        this.NoOfPages = Pages;
        this.Prices = Prices;
        this.Publisher_Name = Publisher_Name;
    }


    void get_Publication() 
	{
        System.out.println("the price of the Journal is :" + this.NoOfPages);
        System.out.println("the no of pages in the Journal is :" + this.Prices);
        System.out.println("the name of the publisher is : " + this.Publisher_Name);
        System.out.println();
    }
}

class Library_Q1 extends Publication 
{
    static String[] list = new String[6];
    static int i;

    Library_Q1() 
	{
        i = 1;
    }

    void set_Publication(int pages, int prices, String publisher_name) 
	{

    }

    void add_ToList(String publishing_Name)
	{
        list[i] = publishing_Name;
        i++;
    }

    void get_Publication() 
	{
        System.out.println("publication list : ");
        for (int i = 1; i < list.length; i++) 
		{
            System.out.println("Publication " + i + ": " + list[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) 
	{
        Library_Q1 add = new Library_Q1();
        Books ace = new Books();
        ace.set_Publication(150, 500, "ace");
        ace.get_Publication();
        add.add_ToList(ace.Publisher_Name);

        Books pro = new Books();
        pro.set_Publication(101, 150, "pro");
        pro.get_Publication();
        add.add_ToList(pro.Publisher_Name);

        Books big = new Books();
        big.set_Publication(101, 150, "big");
        big.get_Publication();
        add.add_ToList(big.Publisher_Name);

        Journal jz = new Journal();
        jz.set_Publication(50, 300, "pp");
        jz.get_Publication();
        add.add_ToList(jz.Publisher_Name);

        Journal dj = new Journal();
        dj.set_Publication(30, 330, "dz");
        dj.get_Publication();
        add.add_ToList(dj.Publisher_Name);

        add.get_Publication();
    }
}


