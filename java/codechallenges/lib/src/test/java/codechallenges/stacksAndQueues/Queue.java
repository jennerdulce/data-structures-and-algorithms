package codechallenges.stacksAndQueues;

import codechallenges.linkedList.LinkedList;
import codechallenges.linkedList.Node;

public class Queue<T> {
  public Node<T> front = null;
  public LinkedList<T> storage;

  public void enqueue(T value){
    storage.append(value);
    if (front == null){
      front = storage.head;
    }
  }

  public T dequeue()throws Exception{
    if(front == null) {
      throw new Exception("Queue is empty");
    }
    Node<T> removedNode = storage.head;
    storage.head = storage.head.next;
    front = storage.head;
    return removedNode.value;
  }

  public T peek() throws Exception{
    if(front == null){
      throw new Exception("Queue is empty");
    }
    return front.value;
  }

  public boolean isEmpty(){
    if(front == null){
      return true;
    }
    return false;
  }
}
