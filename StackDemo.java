import java.util.Stack;
  
public class StackDemo {
    public static void main(String args[])
    {
  
        Stack<> stack = new Stack<>();
  
        
        stack.push("java");
        stack.push("python");
        stack.push("c");
        stack.push("c++");
        stack.push("c#");
  
        System.out.println("Stack: " + stack);
  
        boolean res = stack.remove();
  
       // System.out.println("python removed: " + res);
  
        System.out.println("Final Stack: " + stack);
    }
}