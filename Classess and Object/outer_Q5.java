class outer_Q5
{
    void test()
    {
        System.out.println("sucess");
    }
	
    static class inner
	{
        void test1()
        {
            outer_Q5 out = new outer_Q5();
            out.test();
        }
    }

    public static void main(String[] args)
	{
        outer_Q5.inner obj = new outer_Q5.inner();
        obj.test1(); 
    }
}