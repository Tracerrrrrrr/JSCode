import java.util.Scanner;
class encapsule
{
    private double totalbal=5000;
    private int pwd;
    int withdraw;
    public void check()
    {
        System.out.println("Enter your password to check money");
        Scanner p=new Scanner(System.in);
        pwd=p.nextint();
        if(pwd==333)
        {

        System.out.println("Total money in your account is : "+totalbal)
        }
        else{
            System.out.println("invalid passsword");
        }
    }
    public void withdraw(double money)
    { 
        System.out.println("Enter your password to withdraw money");
        Scanner p=new Scanner(System.in);
        pwd=p.nextint();
        if(pwd==333)
        {
         System.out.println("Enter the amount you want to withdraw");
         Scanner s=new Scanner(System.in);
         withdraw=s.nextint();
         System.out.println("Your withdraw money is:");
                 }
                 else{
                     System.out.println("invalid password");
                 }
    }
    public void deopsite(void money);
    {
        System.out.println("Enter your password");
            Scanner p=new Scanner(System.in);
        pwd=p.nextint();
    }
        public static void main(String[] args)
    {
        System.out.println("Enter Your choice");
         System.out.println("check moeny");
          System.out.println("Enter Your choice");
           System.out.println("Enter Your choice");
            }
}
