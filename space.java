class A                                       //Super class
{ 
    int a=20;

}
class C{
    void show()                                         //Super class method
    {
        System.out.println("Hello from Super Method");
    }
}
class D extends C{
   void show()                                //sub class method same as it's super class
   {
    super.show();
    System.out.println("Hello from sub class");
   }
}
class B extends A                               //Sub class
{
    int a=30;
  void print()
  {
      System.out.println("the value of a is : "+a);
      System.out.println("the value of super variable a is : "+super.a);
  }
}
class space
{
    public static void main(String[] args)
    {
     B r= new B();
     r.print();
     D q=new D();
     q.show();
    }
}