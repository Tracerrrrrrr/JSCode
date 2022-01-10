class a
{
int a,b;
  void show()
  {
   System.out.println("Enter the value of a and b to print : ");
  }
}
    class single extends a
    {
    void print()
    {
    a=2;
    b=3;
    System.out.println("the Vlalue of a is:"+a+"and the value of b is: "+b);
    }
        public static void main(String[] args)
        {
            single r=new single();
            r.show();
            r.print();
        }
    }