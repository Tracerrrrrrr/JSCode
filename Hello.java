import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
  String str="shivam";
   int i=str.length();
   System.out.println(str.toUpperCase());
   System.out.println(str.toLowerCase());
   String str1="upadhyay";
   int j=str1.length();
   System.out.println(str+" "+str1);
   System.out.println(str.concat(str1));
  if(i==j)
  {
    System.out.println("str and str 1 are equal");
  }
  else
  {
    System.out.println("str and str1 are not equal");
}
}
}
