import java.io.*;
import java.util.*;
class Compute
 {
  void calculate(int n,char ch)
  {
   if(ch=='s')
   {
    int square=n*n;
    System.out.println("square is:"+square);
   }
   else
   {
    int cube=n*n*n;
    System.out.println("cube is:"+cube);
   }
  }
  void calculate(int n,int m,char ch)
  {
   if(ch=='p')
   {
    int product=n*m;
    System.out.println("Product is:"+product);
   }
   else
   {
    int sum=n+m;
    System.out.println("sum is:"+sum);
   }
  }
  void calculate(String str1,String str2)
  {
   if(str1==str2)
   {
    System.out.println("Two strings are equal");
   }
   else
   {
    System.out.println("Strings are not equal");
   }    
  }
 } 
 
class OverloadDemo
 {
   public static void main(String args[])
   {
    Compute obj1=new Compute();
    Compute obj2=new Compute();
    Compute obj3=new Compute();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int a=sc.nextInt();
    System.out.println("Enter a character:");
    Scanner sc1=new Scanner(System.in);
    String ch1=sc1.nextLine();
    char ch2=ch1.charAt(0);
    
    System.out.println("Enter first number:");
    int b=sc.nextInt();
    System.out.println("Enter second number:");
    int c=sc.nextInt();
    System.out.println("Enter a character:");
    String ch3=sc1.nextLine(); 
    char ch4=ch3.charAt(0);
    
    System.out.println("Enter first string:");
    String str1=sc1.nextLine();
    System.out.println("Enter second string:");
    String str2=sc1.nextLine();
    
    obj1.calculate(a,ch2);
    obj2.calculate(b,c,ch4);
    obj3.calculate(str1,str2);
    }
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
         
