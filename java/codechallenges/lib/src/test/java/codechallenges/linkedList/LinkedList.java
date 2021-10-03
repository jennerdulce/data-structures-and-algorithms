package codechallenges.linkedList;

public class LinkedList<T>{
  public Node<T> head = null;

  // insert() OR append()
  public void append(T value){
    Node<T> newNode = new Node<>(value);
    if(this.head != null){
      Node<T> currentNode = this.head;
      while(currentNode.next != null){
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
    } else {
      this.head = newNode;
    }
  }

  public void insertFront(T value){
    Node<T> newNode = new Node<>(value);
    if(this.head != null){
      Node<T> previousHead = this.head;
      newNode.next = previousHead;
      this.head = newNode;
      } else {
      this.head = newNode;
    }
  }

  public String insertBefore(T value, T newValue){
    Node<T> newNode = new Node<>(newValue);
    Node<T> currentNode = this.head;
    if(currentNode == null){
      return "This Linked List is empty";
    }
    if(currentNode.value == value){
      Node<T> oldHead = this.head;
      this.head = newNode;
      this.head.next = oldHead;
      return "Node added to the head of the Linked List";
    } else {
      while (currentNode.next != null){
        if(currentNode.next.value == value){
          newNode.next = currentNode.next;
          currentNode.next = newNode;
          return "Node successfully added";
        }
        currentNode = currentNode.next;
      }
    }
    return "Value is not in the Linked List";
  }

  // insertAfter()
  public String insertAfter(T value, T newValue){
    Node<T> newNode = new Node(newValue);
    Node<T> currentNode = this.head;
    if(currentNode == null){
      return "This Linked List is empty";
    }
    if(this.head != null){
      while(currentNode != null){
        if(currentNode.value == value){
          newNode.next = currentNode.next;
          currentNode.next = newNode;
          return "Node successfully added";
        }
        currentNode = currentNode.next;
      }
    } else {
      this.head = newNode;
      return "Node added to the head of the Linked List";
    }
    return "Value is not in the Linked List";
  }

  // Delete
  public String delete(T value){
    Node<T> currentNode = this.head;
    if(currentNode == null){
      return "Linked List is empty";
    }
    if(currentNode.value == value){
      Node newHead = currentNode.next;
      this.head = newHead;
      return "Node has been deleted";
    }
    while(currentNode.next != null){
      if(currentNode.next.value == value){
        Node updateNode = currentNode.next.next;
        currentNode.next = updateNode;
        return "Node has been deleted";
      }
    }
    return "Node is not in the Linked List";
  }

  // includes()
  public boolean includes(T value){
    Node<T> currentNode = this.head;
    while(currentNode != null){
      if (currentNode.value == value){
        return true;
      } else {
        currentNode = currentNode.next;
      }
    }
    return false;
  }

  public int length(){
    Node<T> currentNode = this.head;
    int length = 0;
    while(currentNode != null){
      currentNode = currentNode.next;
      length++;
    }
    return length;
  }


  public String kthFromEnd(T k) {
    Node<T> currentNode = this.head;
    int length = this.length();
    while(currentNode != null){
      if(length < (int) k){
        return "K is larger than the size of the Linked List";
      }
      if(length - 1 == (int) k){
        return "" + currentNode.value;
      }
      length--;
      currentNode = currentNode.next;
    }
    return "" + currentNode.value;
  }

  public LinkedList<T> zip(LinkedList<T> listA, LinkedList<T> listB) {
    LinkedList<T> newList = new LinkedList();
    Node<T> currentA = listA.head;
    Node<T> currentB = listB.head;
    if (currentA == null && currentB == null) {
      // Do nothing
    } else {
      while (currentA != null || currentB != null) {
        newList.append(currentA.value);
        newList.append(currentB.value);
        currentA = currentA.next;
        currentB = currentB.next;
      }
      while (currentA != null) {
        newList.append(currentA.value);
        currentA = currentA.next;
      }
      while (currentB != null) {
        newList.append(currentB.value);
        currentB = currentB.next;
      }
    }
    return newList;
  }

  // toString()
  @Override
  public String toString(){
    String output = "";
    Node currentNode = this.head;
    while(currentNode != null){
      output += "{ " + currentNode.value + " } -> ";
      currentNode = currentNode.next;
    }
    output += "NULL";
    return output;
  }
}
