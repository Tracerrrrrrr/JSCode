class jop
{
    int a;
    String p;
    jop()
    {
     a=5;
     p="Shivam";
     System.out.println("the value of a is : "+a+" and the value of p is : "+p);
    }
    jop(jop ref)
    {
    a=ref.a;
    p=ref.p;
    System.out.println("the value of a is : "+a+" and the value of p is : "+p);
    }
}
class copycons
{
    public static void main(String[] args)
{
   jop ref= new jop();
   jop ref2=new jop(ref);
}

}