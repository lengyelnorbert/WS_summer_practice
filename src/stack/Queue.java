package stack;

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
      queue[rear] = x;
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


  public boolean isEmpty() {
    if (front == -1 && rear == -1) {
      return true;
    }
    return false;
  }

  public boolean isFull() {
    if ((front + 1) % queue.length == rear) {
      return true;
    }
    return false;
  }


}
