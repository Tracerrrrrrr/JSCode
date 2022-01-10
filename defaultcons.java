class defaultcons
{
    int a;
    String b;
    defaultcons()
    {
     a=3;
     b="Shivam";
    }
    void print()
    {
        System.out.println("the value of a is : "+a+"and the value of b is : " +b);
    } 
    public static void  main(String[] args)
    {
     defaultcons c= new defaultcons();
     c.print();
    }
}