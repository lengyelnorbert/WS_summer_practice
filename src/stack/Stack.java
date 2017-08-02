package stack;

import java.util.List;

public class Stack {

  private int[] stack = new int[10];
  private int top = -1;
  private int tail = -1;


  private void push (int x){
    if (top == -1){
      System.out.println("empty stack");
      top ++;
      stack[top] = x;
      else if (top + 1 == tail){
        System.out.println("");
      }
    }
  }
}
