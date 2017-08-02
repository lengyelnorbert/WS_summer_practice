package stack;

import java.util.Arrays;

public class Queue {

  private int[] queue = new int[3];
  private int front = -1;
  private int rear = -1;

  public void enQueue(int x) {
    if (isEmpty()) {
      front = 0;
      rear = 0;
      queue[rear] = x;
    } else if (isFull()) {
      System.out.println("queue is full");
    } else {
      rear++;
      queue[(rear + queue.length) % queue.length] = x;
    }
  }

  public int deQueue() {
    if (isEmpty()) {
      System.out.println("queue is empty");
      return -1;
    } else if ((front + 1 + queue.length) % queue.length == front) {
      int toReturn = queue[front];
      front = -1;
      rear = -1;
      return toReturn;
    }else {
      return queue[front ++];
    }
  }

  public void printCurrentQueue(){
    int[] validQueue = new int[queue.length];
    int startP = front;
    int endP = rear;
    while (startP % queue.length != endP % queue.length){
      validQueue[startP] = queue[startP];

    }
    System.out.println(Arrays.toString(validQueue));
  }


  public boolean isEmpty() {
    if (front == -1 && rear == -1) {
      return true;
    }
    return false;
  }

  public boolean isFull() {
    if ((rear + 1) % queue.length == front) {
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "Queue{" +
            "queue=" + Arrays.toString(queue) +
            ", front=" + front +
            ", rear=" + rear +
            '}';
  }
}
