package codechallenges.trees;

import codechallenges.linkedList.Node;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T> {


  public Node<T> add(T value, Node<T> currentNode){
    Node<T> newNode = new Node(value);
    if(this.root == null){
      this.root = newNode;
      return newNode;
    }
    if(currentNode == null){
      return newNode;
    }
    if((int) newNode.value > (int) currentNode.value){
      currentNode.right = this.add(value, currentNode.right);
    } else {
      currentNode.left = this.add(value, currentNode.left);
    }
    return currentNode;
  }

  public boolean contains(T value, Node<T> currentNode){
    if(value == currentNode.value){return true;}
    if((int) value > (int) currentNode.value){this.contains(value, currentNode.right);}
    if((int) value < (int) currentNode.value){this.contains(value, currentNode.left);}
    return false;
  }
}
