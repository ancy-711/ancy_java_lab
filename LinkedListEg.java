import java.util.LinkedList;

public class LinkedListEg {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("Java");
    ll.add("Python");
    ll.add("c");
    ll.add("c++");
    System.out.println("LinkedList: " + ll);
    ll.clear();
  System.out.println("Updated LinkedList: " + ll);
  }
}