class A
{
int a;
  A(int a)
  {
      this.a=a;
  }
  void show()
  {
      System.out.println(a);
  }
}
class instance
{
    public static void main(String[] args)
    {
    A r=new A(100);
    r.show();
    }
}