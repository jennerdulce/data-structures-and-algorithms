package codechallenges.stacksAndQueues.utils;

import codechallenges.linkedList.Node;
import codechallenges.stacksAndQueues.Stack;

public class StackQueuePseudo<T> {
  public Node<T> front = null;
  public Stack<T> stackA;
  public Stack<T> stackB;

  public StackQueuePseudo() {
    this.stackA = new Stack<>();
    this.stackB = new Stack<>();
  }

  public void enqueue(T value) {
    if (front == null) {
      this.front = new Node<>(value);
    }
    this.stackA.push(value);
  }

  public T dequeue() throws Exception {
    T removedNode;
    if (stackA.isEmpty()) {
      throw new Exception("No items in the Queue");
    } else {
      while (!stackA.isEmpty()) {
        T nodeValue = stackA.pop();
        stackB.push(nodeValue);
      }
      removedNode = stackB.pop();
      this.front = stackB.top;
      while (!stackB.isEmpty()) {
        T nodeValue = stackB.pop();
        stackA.push(nodeValue);
      }
    }
    return removedNode;
  }
}
