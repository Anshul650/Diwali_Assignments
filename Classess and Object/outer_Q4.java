class outer_Q4
{
    void test()
    {
        System.out.println("sucess");
    }
	
    static class inner
	{
        void test1()
        {
            outer_Q4 out = new outer_Q4();
            out.test();
        }
    }

    public static void main(String[] args)
	{
        outer_Q4.inner obj = new outer_Q4.inner(); 
        obj.test1();
    }
}