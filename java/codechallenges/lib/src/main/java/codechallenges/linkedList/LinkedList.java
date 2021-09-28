package codechallenges.linkedList;

public class LinkedList {
  public Node head = null;

  // insert() OR append()
  public void append(int value){
    Node newNode = new Node(value);
    if(this.head != null){
      Node currentNode = this.head;
      while(currentNode.next != null){
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
    } else {
      this.head = newNode;
    }
  }

  public String insertBefore(int value, int newValue){
    Node newNode = new Node(newValue);
    Node currentNode = this.head;
    if(currentNode == null){
      return "This Linked List is empty";
    }
    if(currentNode.value == value){
      Node oldHead = this.head;
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
  public String insertAfter(int value, int newValue){
    Node newNode = new Node(newValue);
    Node currentNode = this.head;
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
  public String delete(int value){
    Node currentNode = this.head;
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
  public boolean includes(int value){
    Node currentNode = this.head;
    while(currentNode != null){
      if (currentNode.value == value){
        return true;
      } else {
        currentNode = currentNode.next;
      }
    }
    return false;
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
