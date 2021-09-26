package codechallenges.linkedList;

public class LinkedList {
  public Node head = null;

  // insert()
  public void insert(int value){
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
