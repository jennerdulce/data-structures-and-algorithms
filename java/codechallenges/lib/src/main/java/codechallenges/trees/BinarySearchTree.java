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
    if(newNode.value.compareTo(currentNode.value) > 0){
      currentNode.right = this.add(value, currentNode.right);
    } else if(newNode.value.compareTo(currentNode.value) < 0){
      currentNode.left = this.add(value, currentNode.left);
    }
    return currentNode;
  }

  public boolean contains(T value, Node<T> currentNode){
    if(value.compareTo(currentNode.value) == 0){return true;}
    if(value.compareTo(currentNode.value) > 0){return this.contains(value, currentNode.right);}
    if(value.compareTo(currentNode.value) < 0){return this.contains(value, currentNode.left);}
    return false;
  }
}
