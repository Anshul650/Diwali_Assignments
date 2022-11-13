class Account 
{
    int account_Number;
    String holder_Name;
    double balance;

    Account() 
	{
        account_Number = 0;
        holder_Name = "";
        balance = 0.0;
    }

    void set(int account_Number, String holder_Name, double balance)
	{
        this.account_Number = account_Number;
        this.holder_Name = holder_Name;
        this.balance = balance;
    }


    void get() 
	{
        System.out.println("account holder number is : " + account_Number);
        System.out.println("holders name is :" + holder_Name);
        System.out.println("currentl balance is " + balance);
    }
}

class Saving_Account extends Account 
{
    double interest_rate;
    int time;

    Saving_Account(double interest_rate, int time)
	{
        this.interest_rate = interest_rate;
        this.time = time;
    }

    void Saving_yearly_interest() 
	{
        double interest = ((balance * (1 + interest_rate * time)) - balance) / 5;
        System.out.println("yearly interest is " + interest);
    }
}

class Current_Account extends Account
 {
    double interest_rate;
    int time;

    Current_Account(double interest_rate, int time)
	{
        this.interest_rate = interest_rate;
        this.time = time;

    }

    void current_yearly_interest()
	{
        double interest = ((balance * (1 + interest_rate * time)) - balance) / 5;
        System.out.println("yearly interest is " + interest);
        System.out.println();
        System.out.println();
    }
}

class Manager_Q2 
{
    static int count = 1;
    String[] Customer_List = new String[4];
	
    void List(String name)
    {
        Customer_List[count] = name;
        count++;
    }
	
    void show_list()
    {
        for(int i =1;i<Customer_List.length;i++)
        {
            System.out.println(i+" "+Customer_List[i]+" ");
        }
    }

    public static void main(String[] args)
	{
        Manager_Q2 sample = new Manager_Q2();

        Current_Account ace = new Current_Account(0.10, 5);
        ace.set(101, "ace", 15000);
        ace.get();
        ace.current_yearly_interest();
        sample.List(ace.holder_Name);

        Current_Account pro = new Current_Account(0.10, 3);
        pro.set(105, "pro", 67890);
        pro.get();
        pro.current_yearly_interest();
        sample.List(pro.holder_Name);

        Saving_Account max = new Saving_Account(0.5, 10);
        max.set(500, "max", 56000);
        max.get();
        max.Saving_yearly_interest();
        sample.List(max.holder_Name);

        System.out.println();
        System.out.println("And the list of Customers is : ");
        sample.show_list();
    }
}