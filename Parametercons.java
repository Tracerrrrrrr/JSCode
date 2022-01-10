class Parametercons
{
    int x,y,z;
    Parametercons(int a,int b)
    {
        x=a;
        y=b;

    }
    Parametercons(String a,String b)
    {
        System.out.println(a+" "+b);
    }
    void print()
    {
        System.out.println("the value of a is : "+x+"and the value of b is :"+y+"and the valeu of z is: "+z);
    }
  public static void main(String[] args)
          {
              Parametercons i=new Parametercons(10,20);
              Parametercons j=new Parametercons("Shivam","Upadhyay");
              i.print();
           
}
}
