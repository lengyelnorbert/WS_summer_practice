import java.util.Arrays;
import stack.Stack;

public class Main {

  public static void main(String[] args) {
//    stack();
    



  }


  public static void stack(){
    Stack newStack = new Stack();
    System.out.println(newStack.top());
    newStack.push(8);
    System.out.println(newStack.top());
    newStack.push(9);
    System.out.println(newStack.top());
    newStack.push(22);
    System.out.println(newStack.top());
    newStack.pop();
    newStack.push(222);
    System.out.println(newStack.toString());
    newStack.pop();
    newStack.pop();
    newStack.pop();
    newStack.pop();
  }
}
