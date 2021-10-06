import java.io.*;
import java.util.*;
class Demo
{
 void run(int x,int y)
 {
  System.out.println("Appended number is:");
  System.out.println(x+""+y);
 }
}
class Main
{
 public static void main(String args[])
 {
  Demo obj1=new Demo(); 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number:");
  int a=sc.nextInt();
  System.out.println("Enter second number:");
  int b=sc.nextInt();
  obj1.run(a,b);
  }
 } 
