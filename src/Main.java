import java.util.Arrays;
import stack.Queue;
import stack.Stack;

public class Main {

  public static void main(String[] args) {
//    stack();
    queue();




  }

  public static void queue(){
    Queue newQueue = new Queue();
    System.out.println(newQueue.toString());
    newQueue.printCurrentQueue();
    newQueue.enQueue(5);
    System.out.println(newQueue.toString());
    newQueue.printCurrentQueue();
    newQueue.enQueue(8);
    System.out.println(newQueue.toString());
    newQueue.printCurrentQueue();
    newQueue.enQueue(10);
    System.out.println(newQueue.toString());
    newQueue.printCurrentQueue();
    newQueue.enQueue(12);
    System.out.println(newQueue.toString());
    newQueue.printCurrentQueue();
    newQueue.deQueue();
    System.out.println(newQueue.toString());
    newQueue.printCurrentQueue();
    newQueue.enQueue(18);
    System.out.println(newQueue.toString());
    newQueue.deQueue();
    newQueue.printCurrentQueue();

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
