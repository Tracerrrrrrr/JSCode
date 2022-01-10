class A
{
    int a,b,c;
    void add()
    {
        a=10;
        b=20;
        c=a+b;
        System.out.println("Addition is:"+c);
    }
    void sub()
    {
     a=200;
     b=500;
     c=b-a;
     System.out.println("Subtraction is:"+c);
    }
}
class B extends A{
    void multi()
    {
        a=10;
        b=1;
        c=a*b;
        System.out.println("Multiplication is:"+c);
    }
    void division()
    {
        a=10;
        b=5;
        c=a/b;
        System.out.println("Division is:"+c);
    }
}
class C extends B 
{
    void rem()
    {
        a=10;
        b=5;
        c=a%5;
        System.out.println("Remainder is:"+c);
    }
}
class multi
{
    public static void main(String[] args)
    {
        C r=new C();
        r.add();
        r.sub();
        r.multi();
        r.division();
        r.rem();
    }
}