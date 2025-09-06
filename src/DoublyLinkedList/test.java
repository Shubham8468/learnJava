package DoublyLinkedList;

import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Stack<Integer> sk=new Stack<>();
        sk.add(23);
        sk.add(45);
        sk.add(90);
        sk.add(67);
        while (sk.empty()){
          int sh= sk.pop();
          System.out.println(sh);
        }
        //System.out.println("asdfghjkl");
    }
}
