package codechallenges.stacksAndQueues;

import codechallenges.linkedList.LinkedList;
import codechallenges.linkedList.Node;

public class Stack<T> {
  public Node<T> top = null;
  public LinkedList<T> storage;

  public void push(T value){
    storage.insertFront(value);
    top = storage.head;
  }

  public T pop() throws Exception {
    Node<T> removedNode = this.top;
    if(removedNode == null){
      // How to raise exception but also return a value?
      throw new Exception("Stack is empty");
    } else {
      Node<T> newHead = storage.head.next;
      storage.head = newHead;
      this.top = newHead;
    }
    return removedNode.value;
  }

  public T peek() throws Exception{
    if(top == null){
      throw new Exception("Stack is empty");
    }
    return top.value;
  }

  public boolean isEmpty(){
    if(top == null){
      return true;
    }
    return false;
  }
}
