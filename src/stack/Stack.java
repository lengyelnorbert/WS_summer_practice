package stack;


import java.util.Arrays;

public class Stack {

  private int[] stack = new int[3];
  private int top = -1;
  private int tail = -1;

  public Stack() {
  }

  public void push(int x) {
    if (isEmpty()) {
      top++;
      stack[top] = x;
    } else if (top + 1 == stack.length) {
      System.out.println("stack is full");
    } else {
      top++;
      stack[top] = x;
    }
  }

  public int top() {
    if (isEmpty()) {
      System.out.println("the stack is empty");
      return -1;
    }
    return stack[top];
  }

  public void pop() {
    if (isEmpty()) {
      System.out.println("empty stack, nothing to pop");
    } else {
      top--;
    }
  }

  public boolean isEmpty(){
    return (top == -1);
  }

  @Override
  public String toString() {
    return "Stack{" +
            "stack=" + Arrays.toString(stack) +
            ", top=" + top +
            ", tail=" + tail +
            '}';
  }
}

